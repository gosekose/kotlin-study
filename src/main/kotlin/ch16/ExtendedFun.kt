package ch16

open class Train (val name: String, val price: Int) {
    open fun getMark(): String {
        return "$name: mark"
    }
}

class Srt(name: String, price: Int) : Train(name, price) {
    override fun getMark(): String {
        return "{$name}_STR"
    }
}

fun Train.isExpensive(): Boolean {
    println("Train is Expensive")
    return true
}

fun Srt.isExpensive(): Boolean {
    println("Srt is Expensive")
    return true
}

fun main() {
    val srt = Srt("SUSEO SRT", 3_000) // Srt 확장 함수
    srt.isExpensive()

    val srt2: Train = Srt("SUSEO Train", 3_000) // Train 확장 함수
    srt2.isExpensive()
}