import ch1.VariableTest
import ch10.KPerson
import ch10.KPersonDefault

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    var variableTest = VariableTest()

    val person = KPerson("kose")
    val person2 = KPerson()
    person.age = 100
    person2.age = 12

    val kPerson = KPersonDefault("test", 123)
    println(kPerson.name3)
}