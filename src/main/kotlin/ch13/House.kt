package ch13

// 중첩클래스는 java와 다르게 내부에 class를 선언하면 자동으로 static이 처리
class House (
    val address: String,
    val livingRoom: LivingRoom
        ) {

    class LivingRoom(
        private val area: Double
    )
}

