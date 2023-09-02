package scope

/* 영역 함수 */
class Address {
    var zipCode: Int = 0
    var city: String = ""
    var street: String = ""
    var house: String = ""

    fun post(message: String): Boolean {
        println("Message for {$zipCode, $city, $street, $house}: $message")
        return readlnOrNull() == "OK"
    }
}

/* 문맥이 없는 run */
class RunAddress(
    private val city: String,
    private val street: String,
    private val house: String
) {
    fun asText() = "$city, $street, $house"
}

fun main() {
    val isReceiver = Address().run {
        zipCode = 12345
        city = "London"
        street = "Baker"
        house = "221b"
        post("Hello")
    }

    if (!isReceiver) {
        println("Message is not delivered")
    }

    val address = run {
        val city = readlnOrNull() ?: return
        val street = readlnOrNull() ?: return
        val house = readlnOrNull() ?: return
        RunAddress(
            city = city,
            street = street,
            house = house,
        )
    }

    println(address.asText())
}