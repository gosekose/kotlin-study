package clazzstructure.structures

open class VehicleByInit {
    init {
        println("Initializing Vehicle")
    }
}

open class CarByInit : VehicleByInit() {
    init {
        println("Initializing Car")
    }
}

open class TruckByInit : CarByInit() {
    init {
        println("Initializing Truck")
    }
}

fun main() {
    TruckByInit()
}