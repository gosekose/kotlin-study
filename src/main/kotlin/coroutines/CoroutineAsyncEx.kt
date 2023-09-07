package coroutines

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay

@OptIn(DelicateCoroutinesApi::class)
suspend fun main() {
    val message = GlobalScope.async {
        delay(100)
        "abc"
    }

    val count = GlobalScope.async {
        delay(100)
        1 + 2
    }

    delay(200)

    val result = message.await().repeat((count.await()))
    println(result)
}