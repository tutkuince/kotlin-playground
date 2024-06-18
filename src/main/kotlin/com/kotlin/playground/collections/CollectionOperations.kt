package com.kotlin.playground.collections

import com.kotlin.playground.dataset.Course
import com.kotlin.playground.dataset.CourseCategory
import com.kotlin.playground.dataset.courseList

fun exploreFilter(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val developmentCourses = courseList
        //.filter { it.category == CourseCategory.DEVELOPMENT }
        .filter { predicate.invoke(it) }
        .forEach { println("Course: $it") }
}

fun exploreMap(courseList: MutableList<Course>) {
    val courses = courseList
        .map { "${it.category.name.uppercase()} - ${it.name.uppercase()}" }
    println("Courses: $courses")
}

fun main() {
    val courseList = courseList()
    val devPredicate = { course: Course -> course.category == CourseCategory.DEVELOPMENT }
    val desPredicate = { course: Course -> course.category == CourseCategory.DESIGN }
    exploreFilter(courseList, devPredicate)
    println("---DESIGN-COURSES---")
    // exploreFilter(courseList, desPredicate)
    exploreMap(courseList)
}


