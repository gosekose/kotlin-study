# enum

- 미리 정의된 상수들로 이뤄진 제한된 집합을 표현하는 클래스
- 코틀린의 enum은 특정 타입에 속하는 미리 정해진 전역 상수를 정의함
- 객체와 마찬가지로 전역 상수로 사용할 수 있는 방법이 없는 위치에서는 이넘 정의 불가
- 커스텀 멤버가 있는 enum 정의 가능
  - 이넘 클래스는 함수, 프로퍼티, 주생성자, 부생성자, 초기화 블록, 내부/내포된 클래스, 객체 등 포함
  - 이넘 상수 목록 뒤에 존재해야 함
  - 상수 목록과 다른 부분을 구분하기 위해 상수 목록을 세미콜론으로 끝내야 함