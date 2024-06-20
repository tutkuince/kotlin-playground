package com.kotlin.playground.scope.functions

import com.kotlin.playground.classes.Course


/**
 * Scope Functions
 *
 * The Kotlin standard library contains several functions whose sole purpose is to execute a block of code
 * within the context of an object
 *
 * When you call such a function on an object with a "lambda expression" provided, it forms a temporary scope.
 *
 * In this scope, you can access the object without its name.
 * There are five of them: "let", "run", "with", "apply", and "also".
 *
 * var nameNullable: String? = null
 * nameNullable?.run {
 *      printName(this)
 *      println("Completed")
 * }
 * Scope Function accepts the lambda
 *
 * Scope functions don't introduce any new technical capabilities, but they can make your code more concise and readable.
 * Due to the many similarities between scope functions, choosing the right one for your use case can be tricky.
 * The choice mainly depends on your intent and the consistency of use in your project.
 *
 * let      -> it (Object Reference)        -> Lambda result (Return Value)
 * run      -> this (Object Reference)      -> Lambda result (Return Value)
 * run      -> - (Object Reference)         -> Lambda result (Return Value)
 * with     -> this (Object Reference)      -> Lambda result (Return Value)
 * apply    -> this (Object Reference)      -> Context Object (Return Value)
 * also     -> it (Object Reference)        -> Context Object (Return Value)
 *
 * Here is a short guide for choosing scope functions depending on the intended purpose:
 *  - Executing a lambda on non-nullable objects: let
 *  - Introducing an expression as a variable in local scope: let
 *  - Object configuration: apply
 *  - Object configuration and computing the result: run
 *  - Running statements where an expression is required: non-extension run
 *  - Additional effects: also
 *  - Grouping function calls on an object: with
 * */

fun main() {
    // exploreApply()
    // exploreAlso()
    exploreLet()
}

fun exploreLet() {
    val numberList = mutableListOf(1, 2, 3, 4, 5)
    val result = numberList.map { it * 2 }.filter { it > 5 }.let {
        println(it)
        it.sum()
    }
    println("Result is $result")

    var name: String? = null
    name = "Tutku"
    val nameResult = name?.let {
        println(it)
        it.uppercase()
    }
    println(nameResult)
}

fun exploreApply() {
    val course = Course(
        1,
        "Design Thinking in Kotlin",
        "Unknown"
    ).apply {
        this.author = "Tutku"
    }
    println("Course $course")
}

fun exploreAlso() {
    val course = Course(
        1,
        "Design Thinking in Kotlin",
        "Unknown"
    ).apply {
        this.author = "Tutku"
    }.also {
        // it.author = "Tutku"
        println("Course is $it")
    }
    // println("Course $course")
}
