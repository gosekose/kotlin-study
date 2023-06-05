package ch14

fun main() {
    val dto1 = KPersonDto("kose", 200)
    val dto2 = KPersonDto("kose", 200)

    println(dto1 == dto2)
    println(dto1.toString())
}

// data 키워드를 붙여주면 equals, hashCode, toString ==> 자동으로 만듬
data class KPersonDto(
    val name: String,
    val age: Int
)