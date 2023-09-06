package interoperability

import java.io.File
import java.io.IOException

@Throws(IOException::class)
fun loadData() = File("data.txt").readLines()

abstract class Loader {
    abstract fun loadData(): List<String>
}

class FileLoader(
    val path: String,
) : Loader() {
    @Throws(IOException::class)
    override fun loadData(): List<String> {
        return File(path).readLines()
    }
}