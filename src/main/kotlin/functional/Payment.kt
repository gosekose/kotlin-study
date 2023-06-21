package functional

import java.lang.IllegalArgumentException

class Payment(val creditCard: CreditCard, val amount: Int) {
    fun combine(payment: Payment): Payment =
        if (creditCard == payment.creditCard)
            Payment(creditCard, amount + payment.amount)
        else
            throw IllegalStateException("Cards don't match")

    companion object{
        fun groupByCard(payments: List<Payment>): List<Payment> =
            payments.groupBy { it.creditCard }
                .values
                .map {it.reduce(Payment::combine)}
    }
}

fun main() {
    val mutableList: MutableList<Payment> = mutableListOf()

    mutableList.add(Payment(CreditCard(2000), 3000))
    mutableList.add(Payment(CreditCard(1000), 7000))
    mutableList.add(Payment(CreditCard(3000), 6000))

    val payments = Payment.groupByCard(mutableList)
    for (payment in payments) {
        println("payment: ${payment.amount} +,  ${payment.creditCard}")
    }

    println(doubleThenIncrement)
    println(add(3 ,4))
    println(multiplyByTwo(9))
    println(fooResult(30))

    val student = Student("gose", 100)
    student.greet()
}

class BankAccount(private var balance: Int) {
    fun deposit(amount: Int) {
        if (amount > 0) {
            balance += amount
        } else {
            throw IllegalArgumentException("송금 실패")
        }
    }

    fun withdraw(amount: Int) {
        if (amount <= balance) {
            balance -= amount
        } else {
            throw IllegalArgumentException("송금 철회")
        }
    }
}

val doubleThenIncrement: (Int) -> Int = { x ->
    val double = x * 2
    double + 1
}

val add: (Int, Int) -> Int = { x, y -> x + y}


fun double(n: Int): Int = n * 2
val multiplyByTwo: (Int) -> Int = { n -> double(n) }
val multiplyByTwo2: (Int) -> Int = ::double

class MyFooClass {
    fun double(n: Int): Int = n * 2
}

val foo = MyFooClass()
val fooResult: (Int) -> Int = foo::double
val fooResult2: (MyFooClass, Int) -> Int = MyFooClass::double


data class Price(val value: Double) {
    operator fun plus(price: Price) = Price(this.value + price.value)
}

data class Weight(val value: Double) {
    operator fun plus(weight: Weight) = Weight(this.value + weight.value)
}

open class Person(val name: String, val age: Int) {
    open fun greet() {
        println("hello")
    }
}

class Student(
    name: String,
    age: Int
    ) : Person(name, age) {
    override fun greet() {
        println("hi hi")
    }
}

abstract class Parent(
    val name: String,
    val age: Int
) {
    abstract fun greet()

    fun finish() {
        println("finish")
    }
}

class ParentImpl(
    name: String,
    age: Int
) : Parent(name, age) {

    override fun greet() {
        println("greet!!!")
    }
}