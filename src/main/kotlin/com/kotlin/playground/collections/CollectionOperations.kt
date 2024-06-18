package com.kotlin.playground.collections

import com.kotlin.playground.dataset.Course
import com.kotlin.playground.dataset.CourseCategory
import com.kotlin.playground.dataset.KAFKA
import com.kotlin.playground.dataset.courseList
import com.kotlin.playground.functions.courseName

fun exploreFilter(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val developmentCourses = courseList
        //.filter { it.category == CourseCategory.DEVELOPMENT }
        .filter { predicate.invoke(it) }
        .forEach { println("Course: $it") }
}

// map
// This operator is fundamentally used to transfer the elements from one form to other form
fun exploreMap(courseList: MutableList<Course>) {
    val courses = courseList
        .map { "${it.category.name.uppercase()} - ${it.name.uppercase()}" }
    println("Courses: $courses")
}

// flatMap
// This operators can be used if the collection has another collection
// Used to flatten the list of lists that is operating on and returns the result as a single list
fun exploreFlatMap(courseList: MutableList<Course>, kafka: String): List<String> {
    val kafkaCourses = courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered.filter { it == kafka }
            .map { courseName }
    }
    return kafkaCourses
}

fun main() {
    val courseList = courseList()
    val devPredicate = { course: Course -> course.category == CourseCategory.DEVELOPMENT }
    val desPredicate = { course: Course -> course.category == CourseCategory.DESIGN }
    exploreFilter(courseList, devPredicate)
    println("---DESIGN-COURSES---")
    // exploreFilter(courseList, desPredicate)
    // exploreMap(courseList)
    val kafkaCourses = exploreFlatMap(courseList, KAFKA)
    println("Kafka Courses: $kafkaCourses")

    val list = listOf(listOf(1, 2, 3), listOf(4, 5, 6))
    val mapResult = list
        .map { outerList ->
            outerList.map { it.toDouble() }
        }
    println("MapResult: $mapResult")            // [[1.0, 2.0, 3.0], [4.0, 5.0, 6.0]]

    val flatMapResult = list
        .flatMap { outerList -> outerList.map { it.toDouble() } }
    println("FlatMapResult: $flatMapResult")    // [1.0, 2.0, 3.0, 4.0, 5.0, 6.0]
}