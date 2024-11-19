package com.example.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var textWelcome = MutableLiveData<String>()

    init {
        textWelcome.value = "Olá mundo!"
    }

    fun getWelcome(): LiveData<String>{
        return textWelcome
    }

    fun doLogin(email: String, password: String) {

    }
}