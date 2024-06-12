package com.kotlin.playground.basics

fun main() {
    // if-else
    // when

    val name: String = "Tutku"
    val result = if (name.length == 4) {
        println("Yes, Name is Four Characters")
        // name    // Return value
        name.length// Return value
    } else {
        println("No, Name is ${name.length} Characters")
        // name    // Return value
        name.length// Return Value
    }
    println("Result: $result")

    // 1 -> GOLD, 2 -> SILVER, 3-> BRONZE
    /*val position: Int = 1
    val positionResult = if (position == 1) {
        "GOLD"
    } else if (position == 2) {
        "SILVER"
    } else if (position == 3) {
        "BRONZE"
    } else {
        "NO MEDAL"
    }
    println("Position Result is $positionResult")*/

    val position: Int = 1
    /*
    val medal = when(position) {
        1 -> {
            "GOLD"
        } 2 -> {
            "SILVER"
        } 3 -> {
            "BRONZE"
        } else -> {
            "NO MEDAL"
        }
    }
    */

    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }
    println("Result: $medal")
}