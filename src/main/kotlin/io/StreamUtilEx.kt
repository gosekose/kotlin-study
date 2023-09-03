package io

import java.io.*

const val DATA_FILE_PATH = "./src/main/kotlin/io/data.txt"

fun main() {

    FileWriter(DATA_FILE_PATH).use { it.write("one\ntwo\nthree\n") }

    FileReader(DATA_FILE_PATH).buffered().use { println(it.readLine()) }
    FileReader(DATA_FILE_PATH).use { println(it.readText()) }
    FileReader(DATA_FILE_PATH).use { println(it.readLines()) }
}