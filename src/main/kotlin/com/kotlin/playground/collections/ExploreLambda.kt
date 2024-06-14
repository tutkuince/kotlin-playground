package com.kotlin.playground.collections

// Higher Order Function
fun calculate(x: Int, y: Int, op: (x: Int, y: Int) -> Int): Int {
    return op(x, y)
}

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

    val multiplyCalculateResult = calculate(5, 4) { x, y -> x * y }
    println("Multiply Calculate Result is $multiplyCalculateResult")

    val addCalculateResult = calculate(5, 4, { x, y -> x + y })
    println("Add Calculate Result is $addCalculateResult")
}