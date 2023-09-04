package clazzstructure.sealeds

abstract class ResultByNotUsedSealed {
    class Success(val value: Any) : ResultByNotUsedSealed() {
        fun showResult() {
            println(value)
        }
    }

    class Error(val message: String) : ResultByNotUsedSealed() {
        fun throwException() {
            throw Exception(message)
        }
    }
}

fun runComputationByNotUsedSealed(): ResultByNotUsedSealed {
    try {
        val a = readlnOrNull()?.toInt() ?: return ResultByNotUsedSealed.Error("Missing First Argument")

        val b = readlnOrNull()?.toInt() ?: return ResultByNotUsedSealed.Error("Missing Second Argument")

        return ResultByNotUsedSealed.Success(a + b)
    } catch (e: Exception) {
        return ResultByNotUsedSealed.Error(e.message ?: "Invalid Input")
    }
}

fun main() {
    val message = when (val result = runComputationByNotUsedSealed()) {
        is ResultByNotUsedSealed.Success -> "Completed successfully: ${result.value}"
        is ResultByNotUsedSealed.Error -> "Error: ${result.message}"
        else -> return
    }

    println(message)
}