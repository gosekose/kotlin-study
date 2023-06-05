package ch16

fun main() {
    val str = "ABC"
    println(str.lastChar())
    val kPerson = KPerson("kose", 100)
    val nextYearAge = kPerson.nextYearAge()


    // 확장함수와 멤버함수가 동일하다면 멤버함수가 호출되는 것
    println(nextYearAge)
}

// String에 대한 확장 함수
// this 수신 객체 타입
// 확장함수가 public이고 수신객체 클래스의 private 함수를 가져온다면 ?
// 확장함수가 클래스에 있는 private 또는 protected 멤버를 가져올 수 없음
fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun KPerson.nextYearAge(): Int {
    return this.age + 1
}

class KPerson(val name: String, val age: Int) {
    fun nextYearAge(): Int {
        println("this is KPerson fun")
        return this.age + 1
    }
}
