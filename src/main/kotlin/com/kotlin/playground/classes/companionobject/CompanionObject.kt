package com.kotlin.playground.classes.companionobject

open class Animal(name: String) {}

/**
 * Companion Object
 *
 * Kotlin does not have the support for the "static" keyword
 * "companion object" can be used to introduce static functionalities that are tied to the class
 * Using object inside the class requires you to use the "companion" keyword
 * You can have variables and functions
 * Usage: Cat.sound()
 * */
class Cat(name: String) : Animal(name) {
    companion object {
        const val breed: String = "Ragdol"
        fun sound() = "Meow"
    }
}

fun main() {
    val sound = Cat.sound()
    println(sound)
    var breed = Cat.breed
    println("Breed: ${Cat.breed}")
}