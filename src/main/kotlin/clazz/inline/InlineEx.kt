package clazz.inline

@JvmInline
value class Dollar(override val amount: Int) : Currency {
    override fun display() = "$$amount"

}

@JvmInline
value class Euro(override val amount: Int) : Currency {
    override fun display() = "E$amount"
}

object CurrencyConverter {
    private const val EURO_TO_DOLLAR_RATE = 1.2

    fun euroToDollar(euro: Euro): Dollar {
        return Dollar((euro.amount * EURO_TO_DOLLAR_RATE).toInt())
    }

    fun dollarToEuro(dollar: Dollar): Euro {
        return Euro((dollar.amount / EURO_TO_DOLLAR_RATE).toInt())
    }
}

interface Currency {
    val amount: Int
    fun display(): String
}

fun main() {
    val dollar = Dollar(3000)
    val euro = Euro(3500)

    val dollarToEuro = CurrencyConverter.dollarToEuro(dollar)
    val euroToDollar = CurrencyConverter.euroToDollar(euro)
    println(dollarToEuro.display())
    println(euroToDollar.display())
}