package com.kotlin.playground.classes

class Person(
    val name: String = "Name",
    val age: Int = 0
) {
    var email: String = ""
    constructor(_email: String, _name: String = "DefaultName", _age: Int = 0) : this(_name, _age) {
        email = _email
    }

    // Class in object oriented programming is fundamentally the blueprint for creating objects
    fun action() {
        println("Person Walks")
    }
}

fun main() {
    val person: Person = Person("Tutku", 35)
    person.action()
    println("Name: ${person.name} and the age is ${person.age}")

    val person1: Person = Person()
    println("Name: ${person1.name} and the age is ${person1.age}")
}