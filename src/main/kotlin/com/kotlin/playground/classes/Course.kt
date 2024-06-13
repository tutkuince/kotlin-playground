package com.kotlin.playground.classes

// Data Class
//
// Classes just holds the data can be categorized as data classes
// DTOs, domain classes and value object classes fall under this category
// In Java, these type of classes are also Java Beans
// Automatically generates the equals(), hashCode() and toString() methods

// Usage & Benefits of data class
//
// Data classes are primarily for classes that's going to behave as a data container
// It autogenerated a lot of functionalities for you when you add the data modifier to the class
// It's pretty easy to create a clone of the object using the copy() function
data class Course(
    val id: Int,
    val name: String,
    val author: String
) {
}

fun main() {
    val course: Course = Course(1, "Reactive Programming", "Tutku")
    val course2: Course = Course(1, "Reactive Programming", "Tutku")
    /*println(course)*/

    println("Checking Object Equality: ${course == course2}")   // True

    val course3: Course = course.copy(
        id = 2, author = "Ince"
    )
    println(course3)
    println("Checking Object Equality: ${course == course3}")   // False
}