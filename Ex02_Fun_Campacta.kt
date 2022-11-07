package com.example.mod4_exerc_funcao_kotlin

class Ex02_Fun_Campacta {
}

fun main() {
    var numero01: Int = 4
    var numero02: Int = 2

    var multiplicar: Int = multiplicacao(numero01, numero02)
    println("O Resultado da multiplicação de $numero01 com $numero02 é: $multiplicar")
}

fun multiplicacao(n01: Int, n02: Int) = n01 * n02

/**Crie uma função compacta que receba dois números inteiros de parâmetro e
 * retorne o resultado da Multiplicação.**/