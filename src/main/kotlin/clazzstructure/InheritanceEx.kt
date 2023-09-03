package clazzstructure

open class VehicleV1 {
    var currentSpeed = 0

    fun start() {
        println("I'm moving")
    }

    fun stop() {
        println("Stopped")
    }
}

open class FlyingVehicleV1 : VehicleV1() {
    open fun takeOff() {
        println("Taking off")
    }

    fun land() {
        println("Landed")
    }
}

class AirCraft(val seat: Int) : FlyingVehicleV1() {
    override fun takeOff() {
        super.takeOff()
    }
}

open class VehicleV2 {
    open fun start() {
        println("I'm riding vehicle")
    }
}

fun VehicleV2.stop() {
    println("Stopped Vehicle")
}

class CarV2 : VehicleV2() {
    override fun start() {
        println("I'm riding car")
    }
}

fun CarV2.stop() {
    println("Stopped Car")
}

open class Entity {
    open val name: String get() = ""
    open val address: String get() = ""
}

class Person(
    override val name: String,
    override var address: String,
) : Entity()

fun main() {
    val carV2 = CarV2()
    val vehicle: VehicleV2 = CarV2()

    carV2.stop()
    vehicle.stop()
}