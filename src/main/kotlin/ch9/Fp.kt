package ch9

class Fp {

    // if-else 익스프레션
    fun max(num1: Int, num2: Int): Int {
        return if (num1 > num2) num1 else num2
    }

    // block 대신 = 로도 사용 가능
    fun maxEqual(num1: Int, num2: Int) : Int =
        if (num1 > num2) num1 else num2

    // 반환타입을 생략하는 경우에는 = 를 사용했기 때문에 가능
    fun maxEqualType(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

    // default 파라미터 --> 메소드 오버로딩 줄이기 가능
    private fun repeat(str: String, num: Int = 3, userNewLine: Boolean = true) {
        for (i in 1 .. num) {
            if (userNewLine) println(str) else print(str)
        }
    }

    private fun printNameAndGender(name: String, gender: String) {
        println(name)
        println(gender)
    }

    private fun printAll(vararg strings: String) {
        for (str in strings) println(str)
    }

    fun nameArgs() {
        this.repeat("test") // default 파라미터로 생략
        this.repeat("test", userNewLine = false) // namedArgument로 userNewLine만 처리하기

        printNameAndGender(name = "kose", gender = "M")

        val array = arrayOf("a" ,"b")
        printAll(*array)
    }




}