package com.lespsan543.practicacorrutinaspmdm.Corrutinas.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class PantallaViewModel : ViewModel() {
    var color by mutableStateOf(Color.Red)

    private var contador by mutableStateOf(0)

    private var texto by mutableStateOf("")

    var isLoading by mutableStateOf(false)


    fun cambiarColor(){
        if (color == Color.Red){
            color = Color.Blue
        }else{
            color = Color.Red
        }
    }

    fun fetchData(){
        viewModelScope.launch {
            try {
                isLoading = true
                llamarApi()
            } catch (e: Exception) {
                println("Error ${e.message}")
            } finally {
                isLoading = false
            }
        }
    }
    fun cambiarTexto(): String{
        if (contador == 0){
            texto = ""
        }else{
            texto = "Respuesta de la API $contador"
        }
        return texto
    }

    private suspend fun llamarApi(){
        contador++
        val result = withContext(Dispatchers.IO){
            delay(5000)
            "Respuesta de la API $contador"
        }
        texto = result
    }
}