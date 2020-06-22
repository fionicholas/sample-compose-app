package com.fionicholas.simplecomposeapp.ui.book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.material.Card
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

class BookActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                setupBookData()
            }
        }
    }

    @Preview
    @Composable
    private fun setupBookData() {
        setupList(BookDataStore.getBooks())
    }

    @Composable
    private fun setupList(books : List<Book>) {
        VerticalScroller {
            Column {
                books.let {
                    it.forEach {book ->
                        showBook(book)
                    }
                }
            }
        }

    }

    @Composable
    private fun showBook(book: Book) {
        Card {
            Column {
                Text(text = book.bookName, style = MaterialTheme.typography.h6)
                Text(text = book.desc, style = MaterialTheme.typography.body2)
            }
        }
    }
}