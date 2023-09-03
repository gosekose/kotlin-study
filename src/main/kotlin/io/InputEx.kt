package io

import java.io.*

fun main() = BufferedReader(InputStreamReader(System.`in`)).use {
    val input = readlnOrNull()?.split("+")
    println(input)
}