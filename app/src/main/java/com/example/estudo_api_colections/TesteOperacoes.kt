package com.example.estudo_api_colections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("--------------------------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média dos salários: ${salarios.average()}")

    val salarioMaiorQue2500 = salarios.filter { it > 2500 }
    println("--------------------------------")
    salarioMaiorQue2500.forEach { println(it) }

    println("--------------------------------")
    println(salarios.count { it in 2000.0..5000.0 })

    println("--------------------------------")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println("--------------------------------")
    println(salarios.any { it == 1000.0 })
}

private fun DoubleArray.maxOrNull() {}
private fun DoubleArray.minOrNull() {}
