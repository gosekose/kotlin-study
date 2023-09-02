package clazz.enums

enum class Color {
    BLUE, RED, BLACK
}

fun Color.isRed() = this == Color.RED

/* enum + when */
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

fun rotateClockWise(direction: Direction) = when (direction) {
    Direction.NORTH -> Direction.EAST
    Direction.EAST -> Direction.SOUTH
    Direction.SOUTH -> Direction.WEST
    Direction.WEST -> Direction.NORTH
}

/* 커스텀 멤버 존재 하는 enum */
enum class WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    val lowerCaseName get() = name.lowercase()
    fun isHoliday() = this == SATURDAY || this == SUNDAY
}

/* 이넘 상수 뒤에도 적절한 생성자 호출 추가 */
enum class RainbowColor(val isCold: Boolean) {
    RED(false), ORANGE(false), YELLOW(false), GREEN(true), BLUE(true), INDIGO(true), VIOLET(true);

    val isWarm get() = !isCold
}

/* 자신만의 정의가 들어 있는 본문 포함 가능 */
enum class WeekDayV2 {
    MONDAY { override fun startWork() = println("Work week monday started")},
    TUESDAY { override fun startWork() = println("Work week tuesday started")},
    WEDNESDAY { override fun startWork() = println("Work week wednesday started")},
    THURSDAY { override fun startWork() = println("Work week thursday started")},
    FRIDAY { override fun startWork() = println("Work week friday started")},
    SATURDAY { override fun startWork() = println("Work week saturday started")},
    SUNDAY { override fun startWork() = println("Work week sunday started")};

    abstract fun startWork()
}

fun main() {
    println(Color.RED.isRed())
    println(Color.BLUE.isRed())
    println(rotateClockWise(Direction.NORTH))
    println(WeekDay.WEDNESDAY.isHoliday())
    println(WeekDay.WEDNESDAY.lowerCaseName)
    println(RainbowColor.BLUE.isWarm)
    WeekDayV2.MONDAY.startWork()
}