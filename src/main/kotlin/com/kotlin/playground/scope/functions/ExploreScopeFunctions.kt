package com.kotlin.playground.scope.functions

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
 * */