package dsl.operator

operator fun String.times(n: Int) = repeat(n)
enum class RainBowColorByOperator {
    RED, ORANGE, YELLOw, GREEN, BLUE, INDIGO, VIOLET;

    operator fun inc() = values[(ordinal + 1) % values.size]
    operator fun dec() = values[(ordinal + values.size - 1) % values.size]

    companion object {
        private val values = enumValues<RainBowColorByOperator>()
    }
}

data class RationalByOperator(
    val sign: Int,
    val num: Int,
    val den: Int,
)

operator fun RationalByOperator.compareTo(r: RationalByOperator): Int {
    val left = sign * num * r.den
    val right = r.sign * r.num * den

    return when {
        left < right -> -1
        left > right -> 1
        else -> 0
    }
}

/* 중위 연산 */
infix fun <T> ((T) -> Boolean).and(other: (T) -> Boolean): (T) -> Boolean {
    return {
        this(it) && other(it)
    }
}

infix fun <T> ((T) -> Boolean).or(other: (T) -> Boolean): (T) -> Boolean {
    return {
        this(it) || other(it)
    }
}

/* operator와 infix 비교 */
data class PointByOperator(val x: Int, val y: Int) {
    operator fun plus(other: PointByOperator): PointByOperator {
        return PointByOperator(x + other.x, y + other.y)
    }
}

data class PointByInfix(val x: Int, val y: Int) {

    infix fun plusAssign(other: PointByInfix): PointByInfix {
        return PointByInfix(x + other.x, y + other.y)
    }
}

class TreeNodeByOperator<T>(val data: T) {
    private val _children = arrayListOf<TreeNodeByOperator<T>>()

    var parent: TreeNodeByOperator<T>? = null
        private set

    operator fun plusAssign(data: T) {
        val node = TreeNodeByOperator(data)
        _children += node
        node.parent = this
    }

    operator fun minusAssign(data: T) {
        val index = _children.indexOfFirst { it.data == data }
        if (index < 0) return
        val node = _children.removeAt(index)
        node.parent = null
    }

    override fun toString() = _children.joinToString(prefix = "$data {", postfix = "}")
}

fun main() {
    println("abc" * 3)

    /* operator와 infix 비교 */
    val pointFirstByOperator = PointByOperator(1, 2)
    val pointSecondByOperator = PointByOperator(1, 2)
    println(pointFirstByOperator.plus(pointSecondByOperator))

    val pointFirstByInfix = PointByInfix(1, 2)
    val pointSecondByInfix = PointByInfix(1, 2)
    println(pointFirstByInfix.plusAssign(pointSecondByInfix))

    /* operator를 활용한 트리노드 */
    val treeNode = TreeNodeByOperator(3)
    println(treeNode.parent)

    treeNode += 10
    treeNode += 12
    treeNode += 123
    println(treeNode.toString())

    treeNode -= 123
    println(treeNode.toString())
}
