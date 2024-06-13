package com.kotlin.playground.classes

class Item() {
    var name: String = ""

    // Recommended approach for constructors
    // Use Primary Constructors whenever possible
    // Use default values for overloaded constructor scenario
    constructor(_name: String): this() {
        name = _name
    }
}

fun main() {
    val item = Item("Iphone")
    println("Item name is ${item.name}")
    item.name = "Iphone 15 Pro Max"
    println("Item name is ${item.name}")

    val person: Person = Person(_email = "tutku@mail.com")
    println("Name: ${person.name} and the age is ${person.age} and the email is ${person.email}")
}