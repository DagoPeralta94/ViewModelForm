package com.example.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    val txtInformation: MutableLiveData<String> = MutableLiveData()

    fun getCurrentInformation() {
        txtInformation
    }

    fun getTxtInformation(
        name: String,
        lastname: String,
        phone: String,
        document: String,
        age: String
    ){
        txtInformation.value =
            "El Nombre es $name, el Apellido es $lastname, el telefono es $phone, el documento es $document y la edad es $age"
    }
}