package com.adrianavallespi.act01

fun main(){
    botDeSeguretat()

}

fun botDeSeguretat(){
    val persona = Persona ("Adriana", 25, listOf("llegir", "pintar", "crochet"))

    if(persona.name == "Adriana") {
        println("exit!")
        when {
            persona.age in 0..13 -> println("ets masa petit")
            persona.age in 14..17 -> println("necessites permis parental")
            persona.age >= 18 -> println("exit!")
        }
        for (elemento in persona.entreteniments.sorted()){
            if(elemento.first() in 'a'..'l'){
                println(elemento)
            }
        }

    } else {
        println("error")
        return
    }

}
data class Persona (val name : String?, val age: Int, val entreteniments : List<String>){

}