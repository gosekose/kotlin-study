package interoperability

import java.util.concurrent.ScheduledThreadPoolExecutor

fun main() {
    val executor = ScheduledThreadPoolExecutor(5)

    executor.execute {
        println("Working on asynchronous task ...")
    }

    executor.shutdown()
}