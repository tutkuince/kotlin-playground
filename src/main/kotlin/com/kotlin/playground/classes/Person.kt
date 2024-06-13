package com.kotlin.playground.classes

class Person {

    // Class in object oriented programming is fundamentally the blueprint for creating objects
    fun action() {
        println("Person Walks")
    }
}

fun main() {
    val person: Person = Person()
    person.action()
}