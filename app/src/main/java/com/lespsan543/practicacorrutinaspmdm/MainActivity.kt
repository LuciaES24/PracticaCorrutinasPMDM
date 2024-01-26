package com.lespsan543.practicacorrutinaspmdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lespsan543.practicacorrutinaspmdm.screens.Pantalla
import com.lespsan543.practicacorrutinaspmdm.screens.PantallaViewModel
import com.lespsan543.practicacorrutinaspmdm.ui.theme.PracticaCorrutinasPMDMTheme

class MainActivity : ComponentActivity() {
    var viewModel = PantallaViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticaCorrutinasPMDMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Pantalla(viewModel)
                }
            }
        }
    }
}