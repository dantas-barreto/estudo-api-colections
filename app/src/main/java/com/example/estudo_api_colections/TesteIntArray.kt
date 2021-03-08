package com.example.estudo_api_colections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 3
    values[2] = 5
    values[3] = 2
    values[4] = 4

    for (i in values) {
        println(i)
    }

    println("------------------------------")

    values.forEach { it
        println(it)
    }

    println("------------------------------")

    for (index in values.indices) {
        println(values[index])
    }

    println("------------------------------")

    values.sort()
    for (valor in values) {
        println(valor)
    }
}