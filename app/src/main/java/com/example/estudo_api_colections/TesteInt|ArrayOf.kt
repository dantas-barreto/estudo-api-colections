package com.example.estudo_api_colections

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    values.forEach { it
        println(it)
    }

    println("---------------------")

    values.sort()
    values.forEach { it
        println(it)
    }
}