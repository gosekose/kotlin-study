package scope

class LetAddress(
    val city: String,
    val street: String,
    val house: String,
) {
    fun post(message: String) {
        println("Message: $message")
    }
}

fun main() {
    LetAddress(
        city = "London",
        street = "Baker",
        house = "house",
    ).let {
        println(it.city)
        it.post("message test")
    }
}
