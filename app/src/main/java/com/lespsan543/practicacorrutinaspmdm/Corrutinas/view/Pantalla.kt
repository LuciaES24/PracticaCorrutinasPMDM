package com.lespsan543.practicacorrutinaspmdm.Corrutinas.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lespsan543.practicacorrutinaspmdm.Corrutinas.viewModel.PantallaViewModel

@Composable
fun Pantalla(viewModel: PantallaViewModel) {
    val color = viewModel.color
    val isLoading = viewModel.isLoading

    if (isLoading){
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Button(onClick = { viewModel.cambiarColor() },
                colors = ButtonDefaults.buttonColors(containerColor = color)) {
                Text(text = "Cambiar color")
            }
            Box(contentAlignment = Alignment.Center,) {
                CircularProgressIndicator(
                    modifier = Modifier
                        .size(70.dp)
                        .align(Alignment.Center)
                )
            }
            Button(onClick = { viewModel.fetchData() }) {
                Text(text = "Llamar API")
            }
        }
    }else{
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

}