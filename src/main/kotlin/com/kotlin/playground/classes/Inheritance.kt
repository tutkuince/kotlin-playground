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

// Allows inheritance with open modifier
open class User(val name: String) {
    fun login() {
        println("Inside user Login")
    }
}

open class Staff(val id: Int) {}
// Only one class may appear in a supertype list
// class Cleaner(name: String): User(name), Staff() {}

class Student(name: String): User(name) {}

class Instructor(name: String): User(name) {}

fun main() {
    val student = Student("Tutku")
    println("Name is ${student.name}")
    student.login()

    val instructor = Instructor("Çiğdem")
    println("Name is ${instructor.name}")
    instructor.login()
}