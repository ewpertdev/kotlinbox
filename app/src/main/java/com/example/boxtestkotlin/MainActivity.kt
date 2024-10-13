package com.example.boxtestkotlin

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // Llamamos a la función que se encarga de crear el diseño
            BoxTest()
        }
    }
}

// Usamos preview para que se vea el diseño en el diseñador de android studio
// showBackground = true para que se vea el fondo
// showSystemUi = true para que se vea la barra de estado
// name = "First View" para que se vea el nombre de la vista
@Preview(showBackground = true, showSystemUi = true, name = "First View")
@Composable
// Funcion que se encarga de crear el diseño
private fun BoxTest() {

    // Tamaño de los cuadrados de color
    val squareSize = 450.dp
    // Colores de los cuadrados
    val firstBoxColor = Color.Black
    val secondBoxColor = Color.Magenta
    // Colores de los textos
    val firstTextColor = Color.Gray
    val secondTextColor = Color.White
    // Tamaño del padding de los textos
    val paddingSize = 16.dp
    // Textos de los cuadrados
    val firstBoxText = "From Fir"
    val secondBoxTextMsg = "HappyBirthday"
    val secondBoxTextName = "Víctor"

    // Primero creamos el contenedor de todo el diseño (es un box)
    // Modifier es un modificador que se le puede aplicar a un elemento para modificar su tamaño, posición, color, etc.
    // Siempre hay que poner un modifier en los elementos, si no, no se verá nada
    // esto se debe a que los elementos no tienen un tamaño y posición por defecto asi que siempre hay que poner un modifier
    // Existen muchos modificadores predefinidos en Compose
    Box(
        modifier = Modifier
            .fillMaxSize() // .fillMaxSize() para que el Box ocupe todo el tamaño del contenedor
            .background(Color.White) // .background(Color.White) para que el Box tenga un color de fondo
    ) {
        // 1º Box
        // .size(400.dp) para que el Box tenga un tamaño de 400dp
        // .background(Color.Black) para que el Box tenga un color de fondo
        // .align(Alignment.TopCenter) para que el Box se alinee en el centro de la pantalla
        Box(
            modifier = Modifier
                .size(squareSize)
                .background(firstBoxColor)
                .align(Alignment.TopCenter)
        ) {
            // Para poner una imagen en el Box se usa Image porque es un elemento que permite poner una imagen en el diseño
            // Guardamos la imagen en el archivo de recursos que sera la carpeta res/drawable/
            Image (
                // painter es el recurso de la imagen que se va a usar
                // painterResource es una función que se encarga de obtener el recurso de la imagen
                // id es el identificador de la imagen en el archivo de recursos
                // R es el paquete de recursos de la aplicación
                painter = painterResource(id = R.drawable.hi),
                // contentDescription es una descripción de la imagen para el lector de pantalla
                contentDescription = "From Fir",
                // contentScale es el modo de escalado de la imagen
                // ContentScale.Crop para que la imagen se corte para que quepa en el Box
                contentScale = ContentScale.Crop,
                // Modifier.fillMaxSize() para que la imagen ocupe todo el tamaño del Box
                modifier = Modifier.fillMaxSize()
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(firstBoxColor.copy(alpha = 0.5f))
                )

                // 1º text
                Text(
                    text = firstBoxText,
                    modifier = Modifier
                        .align(Alignment.Center)
                        // .padding(16.dp) para que el texto tenga un padding de 16dp, padding es el espacio entre el texto y el borde del Box
                        // ponemos padding para que el texto no quede pegado al borde del Box
                        .padding(paddingSize),
                    fontSize = 35.sp,
                    color = firstTextColor,
                    fontFamily = FontFamily.Monospace
                )
            }
            // 2º Box que será el que contenga el texto HappyBirthday Víctor
            Box(
                modifier = Modifier
                    .size(squareSize)
                    .background(secondBoxColor)
                    .align(Alignment.BottomCenter)

            ) {
                Image (
                    painter = painterResource(id = R.drawable.hi),
                    contentDescription = "victor",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(secondBoxColor.copy(alpha = 0.5f))
                    )

                    // El androidx.compose.foundation.layout.Column es simplemente un contenedor que permite alinear los elementos en vertical, en HTML es como usar <div>
                    // androidx.compose.foundation.layout es un paquete que contiene muchos modificadores útiles para diseñar la UI, por ejemplo, Column, Row, Box, etc.
                    // usamos el paquete para que sea más fácil y cómodo el diseño
                    // Lo usamos porque Column me permite alinear los elementos en vertical y horizontal
                    // Se aplica un modificador en el Column para centrar el contenido horizontalmente;
                    // de lo contrario, el contenido se alinearía a la izquierda por defecto.
                    androidx.compose.foundation.layout.Column(modifier = Modifier.align(Alignment.Center)) {

                        // 2º text
                        Text(
                            text = secondBoxTextMsg,
                            modifier = Modifier.padding(paddingSize),
                            color = secondTextColor,
                            fontSize = 55.sp,
                        )
                        // Spacer es un espacio entre los elementos, en este caso entre los textos
                        Spacer(modifier = Modifier.size(8.dp))
                        // 2º text
                        Text(
                            text = secondBoxTextName,
                            modifier = Modifier
                                .padding(paddingSize),
                            color = secondTextColor,
                            fontSize = 120.sp,
                            fontFamily = FontFamily.Cursive
                        )

                    }
                }
            }
        }

