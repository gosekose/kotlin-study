package ch4

class Calculator {

    fun cal(JMoney1: JMoney, JMoney2: JMoney) {
        if (JMoney1.amount < JMoney2.amount) {
            JMoney1.amount *= 2
            println("money1가 적어서 두 배를 하였습니다. 결과: ${JMoney1.amount}")
        }

        if (JMoney1.amount == JMoney2.amount) {
            println("두 금액은 동일합니다. 금액: ${JMoney1.amount}")
        }

        if (JMoney1 === JMoney2) println("두 인스턴스는 값이 같습니다.")
        if (JMoney1 == JMoney2) println("두 인스턴스의 주소가 같습니다")

        val kMoney = KMoney(3)
        val kMoney1 = KMoney(4)

        val compareTo = kMoney.compareTo(kMoney1)
    }
}

class JMoney(var amount: Int) {
}

// 코틀린에서는 상속을 : 클래스명 적기
class KMoney(var amount: Int) : Comparable<KMoney> {
    /**
     * Compares this object with the specified object for order. Returns zero if this object is equal
     * to the specified [other] object, a negative number if it's less than [other], or a positive number
     * if it's greater than [other].
     */
    override fun compareTo(other: KMoney): Int {
        // TODO("Not yet implemented") // todo를 없애지 않는다면  절대 실행되지 않는 것을 의미함
        return amount - other.amount
    }
}
