package com.example.viewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var txtInformation: String = ""

    fun getCurrentInformation(): String{
        return txtInformation
    }

    fun getTxtInformation(name: String, lastname:String, phone:String, document:String, age:String): String{
        txtInformation = "El Nombre es $name, el Apellido es $lastname, el telefono es $phone, el documento es $document y la edad es $age"
        return txtInformation
    }
}