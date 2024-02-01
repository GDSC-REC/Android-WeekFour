package com.example.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layouts.ui.theme.LayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutsTheme {
                Surface {
                    RelativeLayouts()
                }
            }
        }
    }
}

@Composable
fun RelativeLayouts() {
    Column( modifier = Modifier.fillMaxSize() ) {
        Row( modifier = Modifier.padding(10.dp) ) {
            Text(text = "item1 ", modifier = Modifier.background(color = Color(0xFFff0000)))
            Text(text = "item2 ", modifier = Modifier.background(color = Color(0xFF00ff00)))
            Text(text = "item3 ", modifier = Modifier.background(color = Color(0xFF0000ff)))
        }
        Column( modifier = Modifier.padding(10.dp) ) {
            Text(text = "item1 ", modifier = Modifier.background(color = Color(0xFFff0000)))
            Text(text = "item2 ", modifier = Modifier.background(color = Color(0xFF00ff00)))
            Text(text = "item3 ", modifier = Modifier.background(color = Color(0xFF0000ff)))
        }
    }
}

@Preview
@Composable
fun LayoutsPreview() {
    RelativeLayouts()
}
