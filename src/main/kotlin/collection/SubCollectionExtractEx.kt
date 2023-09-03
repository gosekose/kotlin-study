package collection

fun main() {

    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    val sliceList = list.slice(2..4)
    println("sliceList = $sliceList")

    println("slice by listOf = ${list.slice(listOf(1))}")

    /* take, drop은 새로운 컬렉션 반환 */
    val listByTake = list.take(4)
    val listByDrop = list.drop(1)

    println("listByTake = $listByTake")
    println("listByDrop = $listByDrop")

    /* 새로운 컬렉션 생성없이 순회만 해야한다면 subList() 사용 */
    for (item in list.subList(1, list.lastIndex)) {
        println("item = $item")
    }
}