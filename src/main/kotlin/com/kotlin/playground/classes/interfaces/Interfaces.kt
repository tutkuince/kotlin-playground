package com.kotlin.playground.classes.interfaces

import com.kotlin.playground.classes.Course

interface CourseRepository {
    val isCoursePersisted: Boolean
    fun getById(id: Int): Course

    fun save(course: Course): Int {
        println("Course: $course")
        return course.id
    }
}

interface Repository {
    fun getAll(): Any
}

// Multiple Inheritance
class SqlCourseRepository : CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(
            id,
            "Build Kotlin & Spring App",
            "Tutku"
        )
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }

    override fun getAll(): Any {
        return "List"
    }
}

class NoSqlCourseRepository : CourseRepository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(
            id,
            "Build Kotlin & Spring App with MongoDB",
            "Tutku"
        )
    }

    override fun save(course: Course): Int {
        println("NoSqlCourse: $course")
        return course.id
    }
}

interface A {
    fun doSomething() {
        println("doSomething in A")
    }
}

interface B {
    fun doSomething() {
        println("doSomething in B")
    }
}

class AB : A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething in AB")
    }
}

fun main() {
    val repo: SqlCourseRepository = SqlCourseRepository()
    val course = repo.getById(1)
    println("Course is $course")
    val courseId: Int = repo.save(Course(2, "Spring Data JPA with PostgreSQL", "Tutku"))
    println("Is the Course persisted: ${repo.isCoursePersisted}")
    println("Saved CourseId is $courseId")

    val repo2: NoSqlCourseRepository = NoSqlCourseRepository()
    val course2 = repo2.getById(1)
    println("Course is $course2")
    val courseId2: Int = repo.save(Course(2, "Spring Data JPA with MongoDB", "Tutku"))
    println("Saved CourseId is $courseId2")

    val ab: AB = AB()
    ab.doSomething()
}