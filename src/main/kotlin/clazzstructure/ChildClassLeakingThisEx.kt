package clazzstructure

open class PersonByLeakingThis(
    val name: String,
    val age: Int,
) {
    open fun showInfo() {
        println("name = $name, age = $age")
    }

    init {
        showInfo()
    }
}

class StudentByLeakingThis(
    name: String,
    age: Int,
    val university: String,
) : PersonByLeakingThis(name, age) {
    override fun showInfo() {
        println("name = $name, age = $age, university = $university")
    }

    init {
        showInfo()
    }
}

fun main() {
    StudentByLeakingThis("gose", 100, "kose-university")
}