package com.example.mod4_exerc_funcao_kotlin

class Ex03_Fun_Parametro {
}

fun main() {
    var numero_1: Int = 5
    var numero_2: Int = 2

    caluculadora(numero_1,numero_2,::f_soma)
    caluculadora(numero_1,numero_2,::f_multiplica)
}

fun f_soma(valor1: Int, valor2: Int){
    var resultado: Int = valor1 + valor2
    println("A soma de $valor1 e $valor2 é: $resultado")
}

fun f_multiplica(valor1: Int, valor2: Int){
    var resultado: Int = valor1 * valor2
    println("Resultado da multiplicação de $valor1 com $valor2 é: $resultado")
}

fun caluculadora(numero_001: Int, numero_002: Int, operacao: (Int,Int)->Unit) {
    operacao(numero_001, numero_002)
}


//FUNÇÃO ORDEM SUPERIOR
/**Crie uma função calculadora que recebe dois inteiros de parâmetro
 * e um terceiro parâmetro do tipo função.
 * Esta função de parâmetro deve receber dois inteiros de parâmetro
 * e retornar um inteiro.**/

/**01 - Teste esta função passando dois inteiros e a função soma.**/

/**02 - Teste esta função passando os mesmos números inteiros do teste anterior
 * mas passando a função multiplicação desta vez.**/