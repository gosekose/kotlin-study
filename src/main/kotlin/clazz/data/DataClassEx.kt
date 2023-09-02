package clazz.data

/* 동등성 */
data class Person(
    val firstName: String,
    val familyName: String,
    val age: Int,
)

data class MailBox(
    val message: String,
    val person: Person,
)

class PersonV2(
    val firstName: String,
    val familyName: String,
    val age: Int,
)

data class MailBoxV2(
    val message: String,
    val person: PersonV2
)

/* 구조 분해 */
fun combine(
    person1: Person,
    person2: Person,
    folder: ((String, Person) -> String)
): String {
    return folder(folder(" ", person1), person2)
}

fun main() {
    val person1 = Person("gose", "kose", 100)
    val person2 = Person("gose", "kose", 100)

    val mailBox1 = MailBox("message", person1)
    val mailBox2 = MailBox("message", person2)

    val person3 = PersonV2("gose", "kose", 100)
    val person4 = PersonV2("gose", "kose", 100)

    val mailBox3 = MailBoxV2("message", person3)
    val mailBox4 = MailBoxV2("message", person4)

    println(person1 == person2)
    println(mailBox1 == mailBox2)

    println(person3 == person4)
    println(mailBox3 == mailBox4)

    /* copy */
    val copyPerson1 = person1.copy(firstName = "gogose")
    val copyPerson2 = person1.copy(firstName = "gogose")

    println(copyPerson1 == copyPerson2)

    /* 구조 분해 */
    val (firstName, familyName, age) = person1
    println("$firstName, $familyName, $age")

    val (_, familyNameV2, _) = person1
    println(familyNameV2)

    val p1 = Person("g", "o", 100)
    val p2 = Person("k", "o", 100)

    println(combine(p1, p2) {text, (firstName) -> "$text, $firstName"})
}
