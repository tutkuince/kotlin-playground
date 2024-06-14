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

fun main() {
    var nameNullable: String? = null
    println("Value is $nameNullable")   // Value is null

    nameNullable = "Tutku"
    println("Value is $nameNullable")   // Value is Tutku

    // var name: String = null  -- Null can not be a value of a non-null type String
    var name: String = "Tutku"

    val movie = Movie(null, "Titanic")
    val savedMovie: Movie = saveMovie(movie)
    println("Saved Movie is $savedMovie")
}