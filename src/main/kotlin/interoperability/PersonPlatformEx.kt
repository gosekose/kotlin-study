package interoperability

fun main() {
    val person = PersonPlatformJava(null, 25)

    try {
        println(person.name.length)
    } catch (e: NullPointerException) {
        println("NPE 발생 message = ${e.message}")
    }

    val person2 = PersonPlatformAnnotationJava("null 불가", 25)
    println(person2)

}