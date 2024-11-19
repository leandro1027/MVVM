package com.example.mvvm.model

class PersonRepository {
    fun login(email : String, password : String): Boolean{
        return (email == "leandrobalaban78@gmail.com" && password == "12345")
    }
}