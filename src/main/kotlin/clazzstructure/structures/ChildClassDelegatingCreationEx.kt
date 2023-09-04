package clazzstructure.structures

open class PersonByDelegatingCreation(
    val name: String,
    val age: Int,
)

class StudentByDelegatingCreation : PersonByDelegatingCreation {
    val university: String

    constructor(name: String, age: Int, university: String) : super(name, age) {
        this.university = university
    }
}

class StudentV2ByDelegatingCreation(
    name: String,
    age: Int,
    val university: String,
) :
    PersonByDelegatingCreation(name, age)