package com.example.registration

class User(val login: String, val email: String, val password: String) {

    fun getUsers() : String {
        return "Login:$login, email: $email, password: $password"
    }
}