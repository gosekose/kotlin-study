package scope

data class AlsoBook(
    var name: String,
)

fun main() {
    val name = "Also Book"

    val book = AlsoBook("Book").also {
        println(it.name)
        println(name)
        it.name = name
    }

    println("book name = ${book.name}")
}