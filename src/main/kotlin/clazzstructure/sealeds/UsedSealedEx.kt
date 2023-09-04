package clazzstructure.sealeds

sealed class ResultByUsedSealed {
    class Success(val value: Any) : ResultByUsedSealed() {
        fun showInfo() {
            println(value)
        }
    }

    class Error(val message: String) : ResultByUsedSealed() {
        fun throwException() {
            throw Exception(message)
        }
    }
}

fun runComputationByUsedSealed(): ResultByUsedSealed {
    try {
        val a: Int = readlnOrNull()?.toInt() ?: return ResultByUsedSealed.Error("Missing First Argument")
        val b: Int = readlnOrNull()?.toInt() ?: return ResultByUsedSealed.Error("Missing Second Argument")

        return ResultByUsedSealed.Success(a + b)
    } catch (e: Exception) {
        return ResultByUsedSealed.Error(e.message ?: "Invalid")
    }
}

fun main() {
    val result = when (runComputationByUsedSealed()) {
        is ResultByUsedSealed.Success -> "successful"
        is ResultByUsedSealed.Error -> "error"
    }

    println(result)
}