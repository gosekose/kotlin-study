package interoperability

class PersonProperty(@JvmField val firstName: String, val familyName: String) {
}

object PersonObjectJvmField {
    @JvmField val name = "My Application"

    const val NAME = "GOSEKOSE"
}