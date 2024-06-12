package com.kotlin.playground.basics

// Types in Kotlin
// In Kotlin, there is no distinction between primitives and wrapper types
// All numbers in Kotlin are represented as types
// * Integer Types          --> Byte, Short, Int, Long
// * Floating-Point Types   --> Float, Double
// * Character Type         --> Char
// * Boolean Type           --> Boolean

fun main() {
    // val salary: Long = 3000L
    val salary = 3000L
    println(salary)

    val course = "Kotlin Spring"
    //
    // String Interpolation -> $course or ${course.length}
    println("Course Name: $course and the course length is ${course.length}")

    val multiLine = "ABC\nDEF"
    println(multiLine)

    println("--------------")

    //
    // Multiline Strings using TripleQuotes
    val multiLineWithTrimIndent = """
        ABC
        DEF
    """.trimIndent()
    println(multiLineWithTrimIndent)
}
