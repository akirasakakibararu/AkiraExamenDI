package com.example.akiraexamen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.akiraexamen.ui.theme.AkiraExamenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AkiraExamenTheme {
                    VistaVertical()
                }
            }
        }
}


@Composable
fun VistaVertical() {

    Column (modifier = Modifier.fillMaxSize()){
        Column (modifier = Modifier.fillMaxSize()){
            Row{
                TextField()
            }
            Row{

            }
            Row{

            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    AkiraExamenTheme {
        VistaVertical()
    }
}