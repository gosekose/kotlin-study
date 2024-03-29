## 위임
- 코틀린 클래스가 기본적으로 final
- 상속 가능한 클래스를 심사숙고한 후 설계해서 하위 클래스를 만들 수 없는 클래스를 실수로 상속하지 않도록 하기 위함
- 기존 클래스를 확장하거나 변형해야 한다면 ?
  - 기존 클래스를 재사용해야하는 잘 알려진 패턴인 위임 패턴으로 사용 가능
  - 어떤 인터페이스를 만들어야 한다면?
    - 이미 구현된 인스턴스를 가져와서 우리가 만드는 클래스로 감싸고 필요할 때 인터페이스의 메서드 구현을 이 기존 구현 인스턴스에 위임
- 클래스 위임을 사용하면 번거로운 준비 코드를 사용하지 않고 객체 합성과 상속의 이점을 살릴 수 있음
- 상속보다는 합성이라는 객체지향 설계 원칙

### 위임 장점
  - 코드 중복 감소
    - 위임을 사용하면 특정 인터페이스나 클래스의 구현을 다른 객체에게 위임
    - 복잡한 구현을 공유하거나 재사용하는데 사용
  - 구성(Composition)과 오버 상속(inheritance)
    - 상속은 코드 재사용 방법 중 하나지만 떄로는 복잡도가 증가하거나 유연성이 떨어짐
    - 위임을 사용하면 상속없이 다른 클래스의 기능 사용 가능
  - 유연한 코드 확장
    - 위임을 사용하면 기능을 동적으로 바꿀 수 있음
  - 명확한 책임 분리
    - 위임을 사용하면 클래스의 책임을 명확하게 바꿀 수 있음

### 위임 사용 시나리오
  - 데코레이터 패턴
    - 기존 객체 기능을 확장하거나 수정하지 않고 새로운 기능을 추가하고 싶은 경우
  - 프록시 패턴
    - 객체에 대한 접근을 제어하거나, 객체를 게으르게 로드, 원격 객체의 표현을 만들 때 사용
  - 어댑터 패턴
    - 두 호환되지 않는 인터페이스를 함께 작동하게 만들고 싶을 때 사용