package com.kotlin.playground.classes

class Person(
    val name: String = "Name",
    val age: Int = 0
) {
    var email: String = ""
    var nameLength: Int = 0;
    constructor(_email: String, _name: String = "DefaultName", _age: Int = 0) : this(_name, _age) {
        email = _email
    }

    // Class in object oriented programming is fundamentally the blueprint for creating objects
    fun action() {
        println("Person Walks")
    }

    // init code block can be used to run some initialization logic during the instance creation
    init {
        println("Inside Init Block")
        nameLength = name.length
    }
}

fun main() {
    val person: Person = Person("Tutku", 35)
    person.action()
    println("Name: ${person.name} and the age is ${person.age}")
    println("Name length is ${person.nameLength}")

    val person1: Person = Person()
    println("Name: ${person1.name} and the age is ${person1.age}")
    println("Name length is ${person1.nameLength}")

}