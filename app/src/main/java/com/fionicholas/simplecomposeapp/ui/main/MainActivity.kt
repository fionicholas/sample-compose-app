package com.fionicholas.simplecomposeapp.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.Model
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                ButtonCount()
            }
        }
    }
}

@Preview
@Composable
fun ButtonCount() {
    val click = ClickCount()
    Column {
        TopAppBar(title = {
            Text(text = "Sample Compose App")
        },backgroundColor = Color.Blue)
        Text(text = "Welcome to Compose App")
        Button(onClick = {
            click.count++
        }) {
            Text(text = "Button ${click.count}")
        }

    }
}

@Model
class ClickCount(var count: Int = 0)
