package dsl.deletationproperty

/* 위험한 코드 */
class CartItemByDelegationProperty(data: MutableMap<String, Any?>) {
    var title: String by data
    var price: Double by data
    var quantity: Int by data
}

/* 개선 방안 1: Map 쓰기 */
class CartItemSolutionOneByDelegationProperty(data: Map<String, Any?>) {
    val title: String by data
    val price: Double by data
    val quantity: Int by data
}

/* 개선 방안 2: 복사본 쓰기 */
class CartItemSolutionTwoByDelegationProperty(data: MutableMap<String, Any?>) {
    private val dataCopyMap = data.toMutableMap()

    val title: String by dataCopyMap
    val price: Double by dataCopyMap
    val quantity: Int by dataCopyMap
}

fun main() {

    /* 위임 프로퍼티 위험성 */
    var mutableMap: MutableMap<String, Any?> = mutableMapOf(
        "title" to "Laptop",
        "price" to 999.9,
        "quantity" to 1,
    )

    val item = CartItemByDelegationProperty(mutableMap)

    item.title = "1234"

    println("mutableMap = ${mutableMap.values}")

    println(item.title)
    println(item.price)
    println(item.quantity)
}