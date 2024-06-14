package com.kotlin.playground.collections

/**
 * Collections
 * Kotlin re-uses the collections from Java
 *  - Kotlin does not have collections of their own
 *  - Kotlin added a lot of new features through extension functions
 * Kotlin has two types of collections
 *  - Mutable Collections
 *  - Immutable Collections
 *
 * Immutable Collection
 * Collection is not modifiable once created
 * val names = listOf("Tutku", "Çiğdem", "Coco", "Kaju")
 * Map
 *  - hashMapOf("Tutku" to 35, "Çiğdem" to 30)
 * Set
 *  - setOf("adam", "ben", "chloe")
 *
 * Mutable Collection
 * Modifying the data in the collection is allowed
 * var namesMutableList = mutableListOf("Alex", "Ben", "Chloe")
 *
 * Map
 *  - mutableMapOf("Tutku" to 35, "Çiğdem" to 33)
 * Set
 *  - mutableSetOf("adam", "ben", "chloe")
 * */

fun main() {
    val nameList = listOf("Alex", "Ben", "Chloe")
    println("List - Names: $nameList")
    // names.add("Tutku") cannot add new value

    val mutableNameList = mutableListOf("Alex", "Ben", "Chloe")
    mutableNameList.add("Tutku")
    println("List - Names: $mutableNameList")

    val nameSet = setOf("Alex", "Ben", "Chloe", "Ben")
    println("Set - Names: $nameSet")
    val mutableNameSet = mutableSetOf("Alex", "Ben", "Chloe", "Ben")
    mutableNameSet.add("Tutku")
    println("Mutable Set - Names: $mutableNameSet")

    val nameAgeMap = mapOf("Tutku" to 35, "Çiğdem" to 30)
    println("Map - Names and Ages: $nameAgeMap")
    val mutableNameAgeMap = mutableMapOf("Tutku" to 35, "Çiğdem" to 30)
    mutableNameAgeMap["Coco"] = 6
    mutableNameAgeMap["Kaju"] = 2
    println("Mutable Map - Names and Ages: $mutableNameAgeMap")
}