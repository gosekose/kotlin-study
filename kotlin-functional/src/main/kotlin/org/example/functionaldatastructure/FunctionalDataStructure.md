# 함수형 데이터 구조

- 순수함수
  - 제자리에서 데이터를 변경하거나 부수 효과를 수행해서는 안됨
  - 함수형 데이터 구조는 정의상 불변
  - 빈 리스트는 영원히 비어있고 변하면 안됨

- 패턴 매칭 VS 코틀린 매칭
  - 패턴 매칭을 사용하면 논리 식과 어떤 패턴을 일치시킬 뿐만 아니라 식으로부터 값을 추출할 수 있음
  - 코틀린은 패턴 매칭은 존재하지 않지만 when절로 매칭 처리 가능
- 함수형 데이터 구조 안의 데이터 공유
  - 데이터가 불변이면 어떻게 리스트에 원소를 추가하거나 리스트에서 원소를 제거한느 함수를 작성 가능?
  - 기존 리스트 앞에 1이라는 원소를 추가하면 Cons(1, xs)라는 새 리스트를 돌려주면 됨
  - 리스트가 불변이므로 실제로는 xs를 복사할 필요 없음, xs 재사용
    - 이를 데이터 공유
  - 불변 데이터를 공유하면 함수를 더 효율적으로 구현할 수 있는 경우가 있음
  - 다른 코드에서 데이터를 변경할지도 모른다는 걱정을 하지 않고 데이터를 반환할 수 있음
  - 데이터 변경이나 오염을 피하기 위해 비관적으로 복사본을 만들 필요 없음
  - 데이터 구조가 불변이므로 복사본 불 필요
  - 함수형 데이터 구조는 영속적임 
    - 존재하는 참조가 데이터 구조에 대한 연산을 수행한 다음에도 결코 바뀌지 않고 원래대로 남음

- 데이터 공유의 효율
  - 우리가 다루는 데이터 구조의 불변성으로 데이터 공유를 사용할 때 연산을 효율적으로 구현 가능 