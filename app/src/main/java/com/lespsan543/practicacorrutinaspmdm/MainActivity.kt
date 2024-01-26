package com.lespsan543.practicacorrutinaspmdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.lespsan543.practicacorrutinaspmdm.Corrutinas.view.Pantalla
import com.lespsan543.practicacorrutinaspmdm.Corrutinas.viewModel.PantallaViewModel
import com.lespsan543.practicacorrutinaspmdm.ui.theme.PracticaCorrutinasPMDMTheme

class MainActivity : ComponentActivity() {
    private var viewModel = PantallaViewModel()
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