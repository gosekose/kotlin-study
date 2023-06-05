package ch14

class Person(
    private val _name: String,
    private val _country: Country
) {

    val name: String
        get() = _name

    val country: Country
        get() = _country
}


fun handleCountry(person: Person): String {
    return when (person.country) {
        Country.KOREA -> "KOREA"
        Country.AMERICA -> "AMERICA"
    }
}

fun main() {
    val gose = Person("kose", Country.KOREA)
    val result = handleCountry(gose)
    println(result)
}
