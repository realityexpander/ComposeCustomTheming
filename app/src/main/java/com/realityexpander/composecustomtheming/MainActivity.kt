package com.realityexpander.composecustomtheming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.realityexpander.composecustomtheming.ui.LocalSpacing
import com.realityexpander.composecustomtheming.ui.spacing
import com.realityexpander.composecustomtheming.ui.theme.ComposeCustomThemingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCustomThemingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(
                            //LocalSpacing.current.medium // this works
                            MaterialTheme.spacing.medium  // And this works too
                        ),

                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")

                    val context = LocalContext.current

                    //MaterialTheme.spacing.medium
                    LocalSpacing.current.medium
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeCustomThemingTheme {
        Greeting("Android")
    }
}