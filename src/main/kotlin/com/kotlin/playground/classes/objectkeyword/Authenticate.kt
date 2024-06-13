package com.kotlin.playground.classes.objectkeyword

object Authenticate {
    fun authenticate(username: String, password: String) {
        println("User authenticate for userName: $username")
    }
}

// Object Keyword
//
// This keyword allows us to create a class and an instance of the class at the same time
// Equivalent to a singleton pattern in java
// Limitations -> You cannot inject constructor arguments to object classes

fun main() {
    Authenticate.authenticate(password = "123", username = "tutkuince")

}