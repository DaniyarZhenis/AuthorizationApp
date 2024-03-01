package com.example.registration

class User(val login: String, val email: String, val password: String) {

    fun getUsers() : String {
        return "$login, $email, $password"
    }
}