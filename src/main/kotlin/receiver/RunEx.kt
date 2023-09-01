package receiver

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
}