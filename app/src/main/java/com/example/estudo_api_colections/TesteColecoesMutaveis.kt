package com.example.estudo_api_colections

fun main() {

    val joao = Funcionario("João", 5000.0, "CLT")
    val pedro = Funcionario("Pedro", 7250.0, "PJ")
    val maria = Funcionario("Maria", 3000.0, "CLT")

    println("---------------LIST---------------")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("----------------------------------")

    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("----------------------------------")

    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("---------------SET---------------")
    val funcionariosSet = mutableSetOf(pedro)
    funcionariosSet.forEach { println(it) }

    println("---------------------------------")
    funcionariosSet.add(joao)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }
}