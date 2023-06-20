package ch18

// socre function 일시적인 영역

fun main() {
    val person = Person("kose", 1000)
    val value1 = person.let {// let은 it을 호출 it 말고 p처럼 다른 파라미터명 가능
        it.age
    }

    val value2 = person.run { // this는 생략 가능
        this.age
    }

    val value3 = person.also {
        it.age
    }

    val value4 = person.apply {
        this.age
    }

    val person2 = Person("kose", 1000)
    with(person2) {
        println(name)
        println(this.age)
    }

    println(value1)
    println(value2)
    println(value3)
    println(value4)

    val personRepository = PersonRepository()
    val personDB = Person("kose", 1000).run(personRepository::save) // 잘 사용하지 않음
}


fun printPerson(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

fun printPersonUsingLet(person: Person?) {
    person?.let { // safe call
        println(it.name)
        println(it.age)
    }
}
// 람다를 사용해 일시적인 영역을 만들고 코드를 더 간결하게 만들거나, method chaning에 활용하는 함수를 scope function

data class Person(val name: String, val age: Int)

// let -> non-null을 위한 코드블럭을 사용할 때 사용
// let -> 일회성으로 제한된 경우

class PersonRepository {

    fun save(person: Person): Person {
        return person
    }
}