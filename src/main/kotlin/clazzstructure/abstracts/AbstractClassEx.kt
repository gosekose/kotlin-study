package clazzstructure.abstracts

import kotlin.math.PI

abstract class EntityByAbstract(val name: String)

class PersonByAbstract(name: String, val age: Int) : EntityByAbstract(name)

abstract class ShapeByAbstract {
    abstract val width: Double
    abstract val height: Double
    abstract fun area(): Double
}

class CircleByAbstract(val radius: Double) : ShapeByAbstract() {
    val diameter get() = radius * 2

    override val width get() = diameter

    override val height get() = diameter

    override fun area(): Double {
        return PI * radius * radius
    }
}

/* 추상 클래스의 추상 멤버를 구현하는 곳에서 프로퍼티로 설정할 수 있음 (프로퍼티는 게터와 세터가 존재하므로 오버라이딩 가능) */
class RectangleByAbstract(override val width: Double, override val height: Double) : ShapeByAbstract() {
    override fun area(): Double {
        return width * height
    }
}

fun main() {
    val person: EntityByAbstract = PersonByAbstract("gose", 100)
}