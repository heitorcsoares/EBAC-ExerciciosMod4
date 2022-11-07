package com.example.mod4_exerc_funcao_kotlin

class Ex05_Lista_Map {
}

fun main() {
    var nomes = listOf("Heitor", "Luciana", "Penha", "Silvana")
    nomes.map{
        "Olá $it"
    }.forEach{
        println(it)
    }

}


/**Crie uma Lista de string com 4 nomes:
 * 01- Utilizando o operador MAP concatene a string "Ola "
 * antes de cada nome.
 * 02- Percorra a lista modificada usando um forEach e imprima
 * todos os seus valores.
 */