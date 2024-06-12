package com.kotlin.playground.basics

fun main() {
    /*for (i in 1..5) {
        println("i in $i")
        if (i == 3) break
    }*/

    // Return
    /*for (i in 1..5) {
        println("i in $i")
        if (i == 3) return;
    }*/

    println("AFTER-RETURN")
    label()
    println("End of the Program!")
}

fun label() {
    loop@ for (i in 1..5) {
        println("i in label $i")
        // if (i == 3) break@loop
        innerLoop@ for (j in 1..5) {
            println("j in label $j")
            if (j == 2) break@innerLoop
        }
    }
}
