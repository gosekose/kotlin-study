package generic

class TestList<A> {

    fun <A> setGenericList(vararg a: A): List<A> {
        return a.asList()
    }

    fun setClassTypeList(vararg a: A): List<A> {
        return a.asList()
    }
}

fun main() {
    val testList = TestList<Int>()

    val testIntList = testList.setClassTypeList(1, 2, 3, 4, 5)
    val testStringList = testList.setGenericList("1", "2", "3", "4")

    println(testIntList)
    println(testStringList)
}