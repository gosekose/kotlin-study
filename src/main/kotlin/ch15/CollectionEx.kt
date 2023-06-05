package ch15

// 배열보다는 컬렉션을 권장
fun arrMain() {

    // 배열 선언하는 방법
    val arr = arrayOf(100, 200)
    for (a in arr) println("${a}")
    for (i in arr.indices) println("${arr[i]}")
    for ((idx, value) in arr.withIndex()) println("$idx $value")
    arr.plus(300)
}

fun collectionMain() {
    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>() // <> 내부에 타입 명시
    val list = ArrayList<Int>()

    useNumber(emptyList())

    val list2 = mutableListOf<Int>() // 권장되는 방식
    list2.add(300)
    list2.clear()
    list2.add(5400)

}

private fun useNumber(numbers: List<Int>) {

}


fun setMain() {
    val set = mutableSetOf<Int>()
    set.add(3)

    val map = mutableMapOf<Int, String>()
    map.put(3, "kose")
    map[2] = "gose"

    val map2 = mutableMapOf<String, String>()
    map2["kose"] = "gose"
    map2["gose"] = "kose"

    for (key in map2.keys) {
        println(map2[key])
    }

    for ((key, value) in map2.entries) {
        println("$key , $value")
    }
}

fun nullTest(list: List<Int?>) {
// 리스트 원소에 null 가능, 리스트는 절대 null X
}

fun nullTest2(list: List<Int>?) {
// 리스트 원소는 null X, 리스트는 null OK
}

fun nullTest3(list: List<Int?>?) {
// 리스트 원소 및 리스트 모두 null 가능
}

// 자바는 컬렉션의 불변, 가변이 모호하므로 값이 추가되거나 null이 추가될 수 있음
// 따라서, 자바 코드와 호환시에는 명확한 방어 로직이 필요