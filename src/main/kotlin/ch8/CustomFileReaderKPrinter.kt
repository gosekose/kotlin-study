package ch8

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class CustomFileReaderKPrinter {

    // 코틀린은 unchecked exception, checked exception  두차이를 구분하지 않음
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val br = BufferedReader(FileReader(file))
        println(br.readLine())
        br.close()
    }

    fun readFile(path: String) {
        // try - with resources --> .use로 대체
        BufferedReader(FileReader(path)).use {
            reader -> println(reader.readLine())
        }
    }
}