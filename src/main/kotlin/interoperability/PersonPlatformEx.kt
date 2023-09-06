package interoperability

fun main() {
    val person = PersonPlatformClassEx(null, 25)

    try {
        println(person.name.length)
    } catch (e: NullPointerException) {
        println("NPE 발생 message = ${e.message}")
    }

}