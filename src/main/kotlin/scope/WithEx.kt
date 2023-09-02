package scope

class WithAddress(
    val city: String,
    val street: String,
    val house: String,
) {
    fun asText() = "$city, $street, $house"
}


fun main() {
    val message = with(
        WithAddress(
            city = "London", street = "Baker", house = "211b"
        )
    ) {
        "Address: $city, $street, $house"
    }
    println(message)
}