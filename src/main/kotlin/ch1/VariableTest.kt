package ch1

fun VariableTest() {

    var number1 = 10L // 바꿀 수 있는 변수, 타입 작성 X
    number1 = 120L;
    val number2 = 10L // 바꿀 수 없는 변수

    var number3: Int = 123 // : 타입 명시적 활용 가능
    number3 = 123

    var number4: Int // 타입 추론을 위해 명시적 선언하면 값을 먼저 설정 가능
    // 자바와 다르게 원시타입과, 래퍼 타입을 명시적으로 선언하지 않음

    var nullPossibleNumber: Long?  = 13L;
    // null 가능 설정은 타입을 명시적으로 선언하고 타입? 붙이기

    // val 컬렉션이 존재하더라도 값 추가 가능

    var person = Person("seyun")

    println(person.name)
}
class Person(var name:String) {
}