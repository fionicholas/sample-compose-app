package com.fionicholas.simplecomposeapp.ui.book

object BookDataStore {

    fun getBooks() : List<Book> {
        return ArrayList<Book>().apply {
            add(Book(1,"Book 1","book book book"))
            add(Book(2,"Book 2","book book book"))
            add(Book(3,"Book 3","book book book"))
            add(Book(4,"Book 4","book book book"))
            add(Book(5,"Book 5","book book book"))
        }
    }

}