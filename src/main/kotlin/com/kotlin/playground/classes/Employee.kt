package com.kotlin.playground.classes

data class Employee(
    val id: Int,
    val name: String
) {
}

fun main() {
    val employee: Employee = Employee(1, "Tutku")
    println("Employee Id: ${employee.id}, Employee Name: ${employee.name}")

    val employee2: Employee = Employee(1, "Tutku")
    println("Result is ${employee == employee2}")

    val employee3: Employee = employee.copy(
        id = 2,
        name = "Utku"
    )
    println("Employee Id: ${employee3.id}, Employee Name: ${employee3.name}")
}