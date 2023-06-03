package ch4

class LazyCal {

    private fun fun1(): Boolean {
        println("fun 1")
        return true
    }

    private fun fun2(): Boolean {
        println("fun 2")
        return false
    }

    fun lazyFun() {
        if (fun1() || fun2()) println("Lazy 연산")
    }

}