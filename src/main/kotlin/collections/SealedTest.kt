package collections

sealed class PersonStatus

object Running: PersonStatus()
object Walking: PersonStatus()
object Idle: PersonStatus()

fun generatedMessage(personStatus: PersonStatus): String {
    return when(personStatus) {
        Running -> "running"
        Walking -> "walking"
        Idle -> "idle"
    }
}

sealed interface StudentStatus {
    fun study()
    fun eating()
}

object HighSchoolStudentStatus: StudentStatus {
    override fun study() {
        TODO("Not yet implemented")
    }

    override fun eating() {
        TODO("Not yet implemented")
    }
}



