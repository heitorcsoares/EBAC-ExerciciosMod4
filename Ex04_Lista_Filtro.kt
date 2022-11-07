package com.example.mod4_exerc_funcao_kotlin

class Ex04_Lista_Filtro {
}

fun main() {
    var lista1a99 : MutableList<Int> = mutableListOf()

    for(indice in 1..99 step 1){
        lista1a99.add(indice)
    }

    var novaListaFiltro = lista1a99.filter{it % 2 == 0}
    println(novaListaFiltro)
}


/**Crie uma lista com os números inteiro de 1 a 99.
 * Utilizando esta lista crie um filtro que retorna uma
 * lista com os números pares contidos na lista original.
 */