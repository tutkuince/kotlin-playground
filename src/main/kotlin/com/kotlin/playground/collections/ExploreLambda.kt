package com.kotlin.playground.collections

fun main() {
    val addLambda = { x: Int -> x + x }
    val addResult = addLambda(3)
    println("Add Result is $addResult")

    val multiplyLambda = {x: Int, y: Int ->
        println("x is $x and y is $y")
        x * y
    }
    val multiplyResult = multiplyLambda(3, 5)
    println("Multiply Result is $multiplyResult")
}