package com.kotlin.playground.nulls

/**
 * Handling Nulls in Kotlin
 *
 * Kotlin handles nulls little differently compared to Java
 * Kotlin has the concept of Nullable and Non-Nullable types
 * These can be assigned to variables or properties
 *
 * Nullable Type
 * A variable or property can hold a null value
 * How to define a Nullable Type?
 *
 * val nameNullable: String? = null
 * val nameNullable: String? = "Tutku"
 *
 * Non-Nullable Type
 * A variable or property can hold only a non-null value
 * How to define a Non-Nullable Type?
 *
 * val nameNonNull: String = "Tutku"  -- null value is not allowed
 * val nameNonNull = "Tutku"
 * By Default, types are Non-Nullable
 *
 * Dealing with Nulls
 *
 * Safe Call Operator
 * Use the safe call operator to invoke functions safely on it
 * val length = nameNullable?.length
 *
 * Elvis Operator
 * Return a Default value if null
 * val length = nameNullable?.length ?: 0
 *
 * Not Null Assertions
 * Making sure the value is not null after some updates
 * val movie = saveMovie(Movie(null, "Titanic"))
 * println(movie.id!!)
 *
 * */

data class Movie(
    val id: Int?,
    val name: String
)


fun saveMovie(movie: Movie): Movie {
    return movie.copy(
        id = 1
    )
}

fun printName(name: String) {
    println("Name is :$name")
}

fun castValue(any: Any) {
    when (any) {
        any as? Double -> println("Value is Double")
        any as? Int -> println("Value is Int")
    }
}

fun main() {
    var nameNullable: String? = null
    /*if (nameNullable != null) {
        println("Value is $nameNullable.length")   // Value is null
    }*/

    nameNullable?.run { // scope function
        printName(this)
    }

    println("Value is ${nameNullable?.length}")   // safe operator, ?
    val length = nameNullable?.length?.toLong() ?: 0        // elvis operator, :? -> if it is null, return default value
    println("Length is ${length}")

    nameNullable = "Tutku"
    println("Value is $nameNullable")   // Value is Tutku

    // var name: String = null  -- Null can not be a value of a non-null type String
    var name: String = "Tutku"

    val movie = Movie(null, "Titanic")
    val savedMovie: Movie = saveMovie(movie)
    println(savedMovie.id!!)        // non null assertions, !!
    println("Saved Movie is $savedMovie")

    castValue(1)
}