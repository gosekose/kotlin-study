package file_use

import java.io.File

fun readFile(filePath: String) {
    File(filePath).inputStream()
        .use {
            it.bufferedReader()
                .lineSequence()
                .forEach(::println)
        }
}

fun readLine2(filePath: String) {
    File(filePath).forEachLine { println(it) }
}

fun readLine3(filePath: String) {
    File(filePath).useLines { it.forEach(::println) }
}

fun main() {
    readFile("/home/koseyun/projects/kotlin-study/src/main/kotlin/file_use/myFile.txt")
}