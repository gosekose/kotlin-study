
# 동반 확장

- 어떤 클래스의 동반 객체는 이 클래스에 내포된 객체 중에서 바깥 클래스의 이름을 통해 멤버에
접근 할 수 있는 특별한 객체
- ``` kotlin
  fun IntRange.Companion,singletonRange(n: Int) = n..n
  
  fun main() {
    println(IntRange.singletonRange(5))
    println(IntRange.Companion.singletonRange(3))
  }
  ```

- 람다와 수신 객체 지정 함수 타입
  - 함수나 프로퍼티와 마찬가지로 코틀린에서는 람다나 익명 함수에 대해서도 확장 수신 객체들을
    활용할 수 있음
  - 수신 객체 지정 함수 타입이라는 특별한 타입으로 표헌