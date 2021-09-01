package com.example.myapplication

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.util.*

class vehiculo {

    @RequiresApi(Build.VERSION_CODES.O)
    var asd: LocalDateTime = LocalDateTime.now()
    //var anio : Date = LocalDateTime.now();
    var marca: String = ""
    var modelo: String = ""
    var patente: String = ""
    var cantEjes: Int = 0
    var velocidadActual: Int = 0
        set(value) {
            if (controlarVelocidad(value))
                field = value
        }
    var kmActual: Int = 0
        set(value) {
            if (kmActual > 60000)
                field = value;
            else
                noApto()
        }
    var domicilioRadicacion: String = ""
        set(value) {
            if (domicilioRadicacion == "CABA")
                field = value;
            else
                noApto()

        }

    fun noApto() {
        print("Vehiculo no apto para VTV\r")
    }

    fun controlarVelocidad(velocidadActual: Int): Boolean {
        var velocidadOK: Boolean = false;


        if (velocidadActual > 0 && velocidadActual < 20) {
            print("Aumentando velocidad")
            aumentarVelocidad(velocidadActual)
        } else if (velocidadActual > 20) {
            print("Disminuyendo velocidad")
            disminuirVelocidad(velocidadActual)
        }
        if (this.velocidadActual == 20) {
            print("Velocidad OK")
            velocidadOK = true
            return velocidadOK;
        } else
            return false

    }

    fun aumentarVelocidad(velocidadActual: Int): Int {

        var velocidad : Int = 0
        velocidad = velocidadActual;

        while(velocidad < 20)
            velocidad++

        return velocidad
    }

    fun disminuirVelocidad (velocidadActual: Int): Int {

        var velocidad : Int = 0
        velocidad = velocidadActual;

        while(velocidad > 20)
            velocidad --

        return velocidad
    }

}