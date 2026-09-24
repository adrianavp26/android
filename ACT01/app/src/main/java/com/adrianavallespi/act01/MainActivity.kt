package com.adrianavallespi.act01

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Exerecici 01
        val num = 15

        val nota = 8
        val mensaje = "tu nota es un $nota"
        println(mensaje)

        val inmutable = 15
        var siMuta = 3
        siMuta = 2

        //operadors
        var nombre : String? = "Adriana" //el marca com que pot ser null
        print(nombre?.length) //si es null retorna null
        print(nombre!!.length) //diu que es 100% null

        val nomDos : String? = null
        val nomNou = nomDos ?: "hi ha nom" //dona un valor alternatiu
        println(nomNou)

        fun carregant(): Unit {
            println("carregant...")
        }

        //if when try
        val edat = 25
        val missatge = if (edat >= 18) "major d'edat" else "menor d'edat"
        println(missatge)

        val calificacio = 8
        val resultat = when {
            calificacio >= 9 -> "Excelent"
            calificacio >= 7 -> "Notable"
            else -> "suspens"
        }
        print(resultat)

        val numero = try{
            "hola".toInt()
        }catch (e: NumberFormatException){
            -1
        }
        println(numero)

        //lambda
        val nom = "Adriana"
        val salutacio = {nom : String -> "Hola $nom"}

        //mutable inmutable
        val frutas = listOf("platano", "melocoton", "manzana")

        val frutas2 = mutableListOf("platano", "melocoton", "manzana")
        frutas2.add("pera")

        //map i filter
        val numeros = listOf(1,2,3,4)
        val doble = numeros.map { it * 2 } //it es per quan la lambda nomes te un unic parametre
        println(doble)

        val pares = numeros.filter { it % 2 == 0 }
        println(pares)

        open class Animal{
            fun menja (){
                println("l'animal menja")
            }
        }
        class Gat : Animal() {
            fun miola (){
                println("miau, miau")
            }
        }

        //constructor
        class Persona(val nombre : String, val edat: Int)
        //objecte
        val persona = Persona("adriana", 25)

        // cridant a la funcio de bbot del exercici
        botDeSeguretat()

    }
    //enum y sealed class
    enum class Semaforo {
        rojo, amarillo, verde
    }
    fun accion(color: Semaforo): String{
        return when (color){
            Semaforo.rojo -> "para"
            Semaforo.verde -> "continua"
            Semaforo.amarillo -> "preparate"
        }
    }
    sealed class Vehiculo
    class Moto : Vehiculo()
    class Coche : Vehiculo()

    fun describir (v: Vehiculo): String{
        return when (v){
            is Coche -> "es un coche"
            is Moto -> "es una moto"
        }
    }
}