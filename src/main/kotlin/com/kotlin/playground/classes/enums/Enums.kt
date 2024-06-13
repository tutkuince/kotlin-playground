package com.kotlin.playground.classes.enums

data class Book(
    val id: Int,
    val name: String,
    val author: String,
    val category: BookCategory = BookCategory.DEVELOPMENT
)

enum class BookCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main() {
    val marketingBook: Book = Book(
        1,
        "Facebook Marketing",
        "Tutku",
        BookCategory.MARKETING
    )
    println(marketingBook)
}