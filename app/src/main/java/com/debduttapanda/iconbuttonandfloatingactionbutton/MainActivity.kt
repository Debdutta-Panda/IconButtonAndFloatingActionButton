package com.debduttapanda.iconbuttonandfloatingactionbutton

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.debduttapanda.iconbuttonandfloatingactionbutton.ui.theme.IconButtonAndFloatingActionButtonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IconButtonAndFloatingActionButtonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        IconButton(onClick = {
                            Toast.makeText(this@MainActivity, "Button Clicked", Toast.LENGTH_SHORT)
                                .show()
                        }) {
                            Icon(imageVector = Icons.Default.Add, contentDescription = "")
                        }
                        FloatingActionButton(
                            onClick = {
                            Toast.makeText(this@MainActivity, "Button Clicked", Toast.LENGTH_SHORT)
                                .show()
                        },
                            backgroundColor = Color.Red,
                            contentColor = Color.White,
                            elevation = FloatingActionButtonDefaults.elevation(
                                defaultElevation = 8.dp,
                                pressedElevation = 12.dp
                            ),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Icon(imageVector = Icons.Default.Add, contentDescription = "")
                        }
                    }
                }
            }
        }
    }
}
