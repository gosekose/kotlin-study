## 인터페이스
- 인터페이스는 계약, 명세 역할을 함
  - 구체적인 구현을 포함하지 않는 것이 목적에 적합
- 확장성
  - 상태를 포함하는 인터페이스는 확장하기가 어려움
- 캡슐화

### 코틀린 인터페이스
- 디폴트 메서드가 도입된 이후로는 코틀린 인터페이스와 자바 인터페이스가 비슷해짐
- 인터페이스는 (추상, 비추상) 메서드나 프로퍼티를 포함하지만 자체적인 인스턴스 상태나 생성자를 만들 수 없다
- 인터페이스 멤버
  - 디폴트가 추상 멤버
  - 구현을 제공하지 않으면 abstract 변경자가 붙은 것처럼 간주
  - 명시적으로 붙일 수 있으나 불필요
- 인퍼테이스는 클래스나 다른 인터페이스의 상위 타입이 될 수 있음
  - 비추상 클래스가 인터페이스를 상속할 때는 모든 추상 멤버에 대한 구현을 제공해야 함
  - 비추상 멤버를 오버라이드 할 수 있음
  - 인터페이스를 구현할 떄는 override 반드시 써야함
- 인터페이스는 암시적으로 열려 있는 것으로 간주 
  - 상속하는 클래스에서 멤버 오버라이드 가능
  - 인터페이스 멤버를 final로 정의하면 컴파일 오류가 발생
- 자바의 default는 코틀린에서 메서드 바로 구현으로 적용
  ```java 
  interface Test {
    void test() {
      System.out.println("test");
    }
  }
  ```
  
  ```kotlin
  interface Test {
    fun test() {
        println("test")
    }
  }
  ```
  
- 인터페이스 안에는 뒷받침하는 필드가 들어있는 프로퍼티를 정의 불가
  - 초기화 코드 불가 
  - 위임이 붙은 프로퍼티 불가
- 인터페이스를 여러 개 구현할 떄 함수명이 겹치는 경우
  - 명시적으로 오버라이딩 해야 함
  ```
    class TestVehicle: Plane, Ship {
      override fun move() {
          super<Plane>.move()
          super<Ship>.move()
      }
  }
  ```

### 인터페이스에 생성자나 상태를 사용할 수 없다는 제약
- 인터페이스의 다중 구현을 지원하기 위한 것
- 악명 높은 다이아몬드 상속 문제를 방지
```kotlin
    interface Vehicle {
        val currentSpeed: Int
    }

    interface Car: Vehicle

    interface Ship: Vehicle

    class Ampibia : Car, Ship {
        override var currentSpeed = 0
            private set
    }
```
- 만약 인터페이스의 인스턴스 상태를 허용하면, Car, Ship에서 currentSpeed에 대한 값을 미리 설정함
- 두 가지를 다중 구현할 때 currentSpeed가 겹치는 문제 발생할 수 있음
- 인터페이스에 상태를 허용하지 않으므로써 이런 문제 회피 가능