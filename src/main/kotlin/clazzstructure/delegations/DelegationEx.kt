package clazzstructure.delegations

interface PersonDataByDelegation {
    val name: String
    val age: Int
}

open class PersonByDelegation(
    override val name: String,
    override val age: Int,
) : PersonDataByDelegation

data class BookByDelegation(val title: String, val author: PersonDataByDelegation) {
    override fun toString() = "$title by ${author.name}"
}

class AliasByDelegation(
    private val realIdentity: PersonDataByDelegation,
    private val newIdentity: PersonDataByDelegation,
) : PersonDataByDelegation by newIdentity {
    override val age: Int get() = realIdentity.age
}

fun main() {
    val valWatts = PersonByDelegation("Val Watts", 30)
    val introKotlin = BookByDelegation("Introduction to Kotlin", valWatts)

    println(introKotlin)

    val alias = AliasByDelegation(
        PersonByDelegation("gose", 100),
        PersonByDelegation("kose", 10),
    )

    println(alias.name)
    println(alias.age)
}