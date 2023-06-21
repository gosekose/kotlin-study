package ch12

fun moveEx() {
    moveSomthing(object : Movable {
        override fun move() {
            println("무브")
        }

        override fun fly() {
            println("플라이")
        }
    })
}

private fun moveSomthing(movable: Movable) {
    movable.move()
    movable.fly()
}

// java의 static 변수와 함께 만드려면
// kotlin에서는 companion object를 사용해야 함
// companion object도 하나의 객체로 간주
// 다른 타입의 상속을 받을 수 있음
// kotlin에서 싱글톤 클래스를 만들 때 object 키워드 사용
// kotlin에서 익명 클래스를 만들 때 object: 타입 사용
