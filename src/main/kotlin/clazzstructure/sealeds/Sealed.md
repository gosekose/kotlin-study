## sealed
- 프로그램에서 표현하고 싶은 개념이 몇 가지 정해진 변종의 집합으로 구성될 때가 있음
  - 특정 경우에는 각 종류별로 에트리뷰트가 다를 수 있음
      - NotUsedSealedEx
        - ResultByNotUsedSealed의 구현은 Success, Error로 제한하지 못함
        - 다른 클라이언트 코드가 새로운 하위 클래스를 생성하는 것을 막을 수 없음
        ```
            class MyStatus: ResultByNotUseSealed()
        ```
        - 서브 클래싱이 가능하다는 점은 when 절 이후 else가 필요함
        - 컴파일러는 result 변수가 Success, Error의 인스턴스만 담는 것을 모르므로 else가 필요

- 코틀린의 sealed 를 쓰면 위에 NotUsedSealedEx에서 발생할 수 있는 문제를 해결할 수 있음
  - 제한된 클래스 계창
    - 서브타입의 집합을 제한할 수 있음, 해당 클래스나 인터페이스가 특정한 서브타입들을 가질 수 있도록 보장
  - 타입 안정성
    - 위에서 언급하 제한된 클래스 계층으로 sealed 클래스나 인터페이스는 안정적인 코드를 작성할 수 있도록 함
    - 가능한 모든 서브타입을 알고 있기 때문에, 어느것과도 일치하지 않는 예외는 없음
  - 완결성 검사
    - when 표현식에서 유용하게 사용
  - 변형의 제한, 명확한 의도
  - 서브 타입 표현
    - sealed 클래스는 서브타입으로 데이터 클래스, 객체, 일반 클래스등을 포함할 수 있음
- sealed class, sealed interface(코틀린1.5) 모두 선언 가능