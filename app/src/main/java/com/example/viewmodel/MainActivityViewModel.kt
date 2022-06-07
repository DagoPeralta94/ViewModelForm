package com.example.viewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var txtInformation: String = ""

    fun getCurrentInformation(): String{
        return txtInformation
    }

    fun getTxtInformation(name: String, age:String): String{
        txtInformation = "El texto es $name y la edad es $age"
        return txtInformation
    }
}