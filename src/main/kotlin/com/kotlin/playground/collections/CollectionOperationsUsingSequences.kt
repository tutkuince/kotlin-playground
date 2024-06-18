package com.kotlin.playground.collections

import com.kotlin.playground.dataset.Course
import com.kotlin.playground.dataset.CourseCategory
import com.kotlin.playground.dataset.courseList

/**
 * Lazy Evaluation of Collections using Sequences
 *  - This is an alternative API to work with collections
 *  - The operations on the elements of the collection are evaluated lazily
 *
 * What is the benefit of using Sequences?
 *  - Sequences perform better when dealing with collections that are extremely big
 *      - Does not create intermediate collection for each operator
 *      - Sequences are lazy, does not apply the operations for all the elements in the collection
 * */

fun main() {
    val nameList = listOf("alex", "ben", "chloe")
        .asSequence()
        .filter { it.length >= 4 }
        .map { it.uppercase() }
        .toList()   // terminal operation

    println("Name List: $nameList")

    val devPredicate = { course: Course -> course.category == CourseCategory.DEVELOPMENT }
    exploreFilterUsingSequence(courseList(), devPredicate)
}

fun exploreFilterUsingSequence(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val developmentCourses = courseList
        //.filter { it.category == CourseCategory.DEVELOPMENT }
        .asSequence()
        .filter { predicate.invoke(it) }
        .forEach { println("Course: $it") }

    val range = 1..1000_000_000
    range
        .asSequence()
        .map { it.toDouble() }
        .take(40)   // take first 40 element
        .forEach {
            println("Value is $it")
        }
}