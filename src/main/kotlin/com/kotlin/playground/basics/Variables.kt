package com.kotlin.playground.basics

fun main() {

    // val
    // Variables declared with val are immutable variables
    val name: String = "Tutku"
    // name = "Utku" -> Val cannot be reassigned
    println(name)

    // var
    // Variables declared with var are mutable variables
    var age : Int = 35
    println(age)
    age = 36
    println(age)
}