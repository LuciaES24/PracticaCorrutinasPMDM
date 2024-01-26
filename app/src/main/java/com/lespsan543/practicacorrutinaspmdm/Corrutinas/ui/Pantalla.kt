package com.lespsan543.practicacorrutinaspmdm.Corrutinas.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.lespsan543.practicacorrutinaspmdm.Corrutinas.viewModel.PantallaViewModel

@Composable
fun Pantalla(viewModel: PantallaViewModel) {
    val color = viewModel.color

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Button(onClick = { viewModel.cambiarColor() },
            colors = ButtonDefaults.buttonColors(containerColor = color)) {
            Text(text = "Cambiar color")
        }
        Text(text = viewModel.cambiarTexto())
        Button(onClick = { viewModel.fetchData() }) {
            Text(text = "Llamar API")
        }
    }
}