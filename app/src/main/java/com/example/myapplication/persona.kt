package com.example.myapplication

import java.util.*

class persona {


    var nombre : String = ""
        set (value){
            if(value == "Osama Bin Laden")
                llamarFbi()
            else
                field = value;
        }

    var apellido : String = ""
    var edad: Int = 0
        set(value){
            if(edad < 18)
                print("Persona menor de 18 años\r") // No guardar datos.
             else
                field = value;
        }
    var dni : Int = 0
    var mail : String = ""
    //var fechaNacimiento : Date = getDate()
    var domicilio : String = ""
    var discapacitado : Boolean = false;
    var estadoJubilado : Boolean = false;

    fun llamarFbi(){
        print("Alerta! Persona buscada internacionalmente")
    }

    //fun getJubilacion()
    //fun getDiscapacidad()



}