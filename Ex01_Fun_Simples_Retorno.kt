package com.example.mod4_exerc_funcao_kotlin

class Ex01_Soma {
}

fun main() {
    var numero1: Int = 4
    var numero2: Int = 2

    var retorno_soma: Int = soma(numero1, numero2)
    println("A soma de $numero1 e $numero2 é: $retorno_soma")
}

fun soma(n1: Int, n2: Int): Int{
    var soma1e2: Int = n1 + n2
    return soma1e2
}

/**Crie uma função que receba dois números inteiros de parâmetro e retorne o resultado da Soma.**/