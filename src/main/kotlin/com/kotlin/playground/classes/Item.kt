package com.kotlin.playground.classes

class Item() {
    var name: String = ""

    // When to use Custom Getter/Setter?
    // Use it when you have the need to implement the custom logic for setting or retrieving the properties
    var price: Double = 0.0
        get() {
            println("Inside getter")
            return field
        }
        set(value) {
            println("Inside setter")
            if (value >= 0.0) {
                field = value
            } else {
                throw IllegalArgumentException("Negative Price is not allowed!")
            }
        }

    // Recommended approach for constructors
    // Use Primary Constructors whenever possible
    // Use default values for overloaded constructor scenario
    constructor(_name: String) : this() {
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
    println("--------GETTER&SETTER--------")

    item.price = 1.1
    println("Item price is ${item.price}")

}