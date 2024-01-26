package com.lespsan543.practicacorrutinaspmdm.Corrutinas.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class PantallaViewModel : ViewModel() {
    var color by mutableStateOf(Color.Red)

    private var contador by mutableStateOf(0)

    private var texto by mutableStateOf("")

    fun cambiarColor(){
        if (color == Color.Red){
            color = Color.Blue
        }else{
            color = Color.Red
        }
    }

    fun bloqueoApp(){
        Thread.sleep(5000)
        contador++
    }

    fun cambiarTexto(): String{
        if (contador == 0){
            texto = ""
        }else{
            texto = "Respuesta de la API $contador"
        }
        return texto
    }
}