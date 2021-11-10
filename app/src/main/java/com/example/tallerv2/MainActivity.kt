package com.example.tallerv2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variables()
        tabla()
        listado()
        clase1()

        vehiculo()

    }

    // Analizar la edad del usuario
    private fun variables(){
        val numero = 25

        if ((numero >= 18)) {
            println ("$numero es mayor de edad")

        }else if(numero < 18){
            print("$numero es menor de edad")
        }
    }
    // tabla de multiplicar
    private fun tabla(){


        val txt_r = findViewById<TextView>(R.id.textR)
        val btn_t = findViewById<Button>(R.id.button)
        val n = 5
        //btn_t.setOnClickListener{ }
        var tablas = ""
        var tablas2 = ""
        var invertir = 10
        for (i in 1..10){
             tablas+= i.toString() +"x"+ n.toString()+ "="+ (i*n)+"\n"

        }
        println(tablas)

    }
// lista de estudiantes
    private fun listado(){
        var listaE = "Nombre: Daniel Medina " + "Grupo: Finazas " +"Paralelo: A" +
                "Materia: Plataformas moviles" + "\n"+"Nombre: Edgar Guamo " +
                "Grupo: Turismo " +"Paralelo: A" + "Materia: Plataformas moviles" + "\n" +
                "Nombre: Ricardo Freire " + "Grupo: Finazas " +"Paralelo: A" +
                        "Materia: Plataformas moviles" + "\n"
        println(listaE)
    }

    // uso de una clase
    class vehiculo(){

        var marcaA:String = ""
        var tipo:String = ""
        var motor:Int =  0
        var recorrido:Int = 0

        fun imprimir (){
            var lista = "Marca de Auto: $marcaA Tipo: $tipo Motor: $motor Recorrido: $recorrido"
            println(lista)
        }

    }


    fun clase1 () {
        var objeto: vehiculo = vehiculo()
        objeto.marcaA = "BMW"
        objeto.tipo = "Usado"
        objeto.motor = 1600
        objeto.recorrido = 50000

        println("Lista de elementos del vehiculo ${objeto.marcaA}")
        objeto.imprimir()
    }




}