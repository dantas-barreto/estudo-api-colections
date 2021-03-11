package com.example.estudo_api_colections

data class Funcionario(
        val nome: String,
        val salario: Double,
        val tipoContratacao: String

) {
    override fun toString(): String = """
        Nome: $nome
        Salario: $salario
        Contrato: $tipoContratacao
        
    """.trimIndent()
}