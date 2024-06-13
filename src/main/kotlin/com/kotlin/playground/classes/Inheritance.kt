package com.kotlin.playground.classes

// Inheritance is supported in Kotlin
/**
 * Kotlin Concepts:
 * - "Any" is the superclass for any class in Kotlin
 *  - Object Class in Java
 * - All the classes in Kotlin are final
 *  - Extending classes are not allowed by default
 *
 * Kotlin allows inheritance when "open" modifier is used
 * -> open class User(val name: String)
 * Subclass extending the "User" Class
 * class Student(name: String): User(name)
 * */

// Overriding Functions -> Mark the function with "open" modifier
// Overriding Variables -> Similar to functions using the open and override keywords

// Allows inheritance with open modifier
open class User(val name: String) {
    open var isLoggedOut: Boolean = false

    fun login() {
        println("Inside user Login")
    }

    open fun logout() {
        println("Inside user Logout")
    }
}

open class Staff(val id: Int) {}
// Only one class may appear in a supertype list
// class Cleaner(name: String): User(name), Staff() {}

class Student(name: String): User(name) {
    override var isLoggedOut: Boolean = false
    override fun logout() {
        super.logout()
        println("Inside Student Logout")
    }
}

class Instructor(name: String): User(name) {
    override var isLoggedOut: Boolean = true
    override fun logout() {
        println("Inside Instructor Logout")
        super.logout()
    }
}

fun main() {
    val student = Student("Tutku")
    println("Name is ${student.name}")
    student.login()
    student.logout()
    student.isLoggedOut = true
    println("Is Student Logged Out: ${student.isLoggedOut}")

    val instructor = Instructor("Çiğdem")
    println("Name is ${instructor.name}")
    instructor.login()
}