package com.example.estudo_api_colections

fun main() {
    val nomes = Array<String>(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Zacarias"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    println("------------------")
    nomes.sort()
    nomes.forEach { it
        println(it)
    }

    println("-------------------------")
    val nomes2 = arrayOf("Maria", "Zacarias", "Pedro")
    nomes2.sort()
    nomes2.forEach { it
    println(it)
    }
}