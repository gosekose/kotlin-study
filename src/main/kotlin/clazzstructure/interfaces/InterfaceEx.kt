package clazzstructure.interfaces


interface VehicleByInterface {
    val currentSpeed: Int
    fun move()
    fun stop()

    fun print() {
        println(PRINT_PHASE)
    }

    companion object {
        const val PRINT_PHASE: String = "this is vehicle"
    }
}

interface FlyingVehicleByInterface : VehicleByInterface {
    override val currentSpeed: Int
    fun takeOff()
    fun land()
}
class CarByInterface(override val currentSpeed: Int) : VehicleByInterface {
    override fun move() {
        println("car move")
    }

    override fun stop() {
        println("car stop")
    }
}

class AirPlaneByInterface(override val currentSpeed: Int) : FlyingVehicleByInterface {
    override fun takeOff() {
        println("AirPlane takeOff")
    }

    override fun land() {
        println("AirPlane land")
    }

    override fun move() {
        println("AirPlane move")
    }

    override fun stop() {
        println("AirPlane stop")
    }
}


interface ShipByInterface {
    fun move() {
        println("ship move")
    }
}

interface PlaneByInterface {
    fun move() {
        println("ship move")
    }
}

class TestVehicle: PlaneByInterface, ShipByInterface {
    override fun move() {
        super<PlaneByInterface>.move()
        super<ShipByInterface>.move()
    }
}