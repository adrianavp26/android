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

        val nom : String? = null
        val nomNou = nom ?: "hi ha nom" //dona un valor alternatiu
        println(nomNou)
    }
}