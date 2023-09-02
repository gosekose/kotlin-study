package scope

data class ApplyBook(
    var name: String,
)

fun main() {
    val name = "Apply Book"

    val book = ApplyBook("Book").apply {
        println(this.name)
        println(name)
        this.name = name
    }

    println("book name = ${book.name}")
}