package clazzstructure.types

/* 위임 프로퍼티 스마트 캐스팅 불가 예시 */
class HolderByTypeCasting {
    val o: Any get() = ""
}

class WalletByTypeCasting(
    var wallet: Any = "123",
) {
    fun changeWallet() {
        if (wallet is String) {
//            println(wallet.length) // error
        }
    }
}

fun main() {/* is로 관계 표현 */
    val checkArray = arrayOf("1", null, 1)

    for (item in checkArray) {
        println("item = $item, item type is Int ? ${item is Int}")
    }

    /* when 절 사용 가능 */
    val objects = arrayOf("1", 2, "3", 4, '1', '2')
    var sum = 0

    for (obj in objects) {
        when (obj) {
            is Int -> sum += obj
            is String -> sum += obj.toInt()
        }
    }

    println("sum = $sum")

    /* 위임을 사용하는 프로퍼티는 스마트 캐스팅 불가 */
    val o: Any by lazy { 1234 }
    if (o is Int) {
//        println(o * 3) // error: smart cast to 'Int' is impossible
    }

    /* as / as? */
    val any: Any = "123"
    println(any as? Int)
    try {
        println(any as Int)
    } catch (e: Exception) {
        println(e.message)
    }
}