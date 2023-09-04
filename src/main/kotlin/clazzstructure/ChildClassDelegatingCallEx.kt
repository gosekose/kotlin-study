package clazzstructure

open class PersonByDelegatingCall(
    val name: String,
    val age: Int,
) {
    init {
        println("This is PersonByDelegatingCall, name = $name, age = $age")
    }
}

class StudentByDelegatingCall(
    name: String,
    age: Int,
    val university: String,
) : PersonByDelegatingCall(name, age) {
    init {
        println("This is StudentByDelegatingCall, name = $name, age = $age, university = $university")
    }
}

open class PersonByDelegatingCallAndOpenParam(
    open val name: String,
    open val age: Int,
) {
    init {
        println("This is PersonByDelegatingCallAndOpenParam, name = $name, age = $age")
    }
}

class StudentByDelegatingCallAndOverride(
    override val name: String,
    override val age: Int,
    val university: String,
) : PersonByDelegatingCallAndOpenParam(name, age) {
    init {
        println("This is StudentByDelegatingCallAndOverride, name = $name, age = $age, university = $university")
    }
}

fun main() {
    StudentByDelegatingCall("gose", 100, "kose-university")
    println()
    StudentByDelegatingCallAndOverride("gose", 100, "kose-university")
}