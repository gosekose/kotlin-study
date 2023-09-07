package coroutines

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.System.currentTimeMillis

suspend fun foo() {
    println("Task started")
    delay(200)
    println("task finished")
}


@OptIn(DelicateCoroutinesApi::class)
fun main() {
    val time = currentTimeMillis()

    GlobalScope.launch {
        delay(100)
        println("Task 1 finished in ${currentTimeMillis() - time} ms")
    }

    GlobalScope.launch {
        delay(100)
        println("Task 2 finished in ${currentTimeMillis() - time} ms")
    }

    GlobalScope.launch {
        delay(100)
        println("Background task: ${Thread.currentThread().name}")
    }

    runBlocking {
        delay(100)
        println("Primary task: ${Thread.currentThread().name}")
    }
}