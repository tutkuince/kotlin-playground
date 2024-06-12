package com.kotlin.playground.basics

fun main() {
    val range = 1..10 // 1 <= 10            -- Creates a Range of 10 values
    for (i in range) {
        println("i: $i")
    }

    // 10..1
    val reverse = 10 downTo 1 // 10 >= 1    -- Progression of Values in decreasing order
    for (i in reverse) {
        println("Reverse Range: $i")
    }

    // Skip 2th values                            -- Skip values in the iteration
    for (i in reverse step 2) {
        println("Reverse Range with Skip: $i")
    }
}