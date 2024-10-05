package com.example.boxtestkotlin

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            BoxTest()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "First View")
@Composable
private fun BoxTest() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            modifier = Modifier
                .size(400.dp)
                .background(Color.Black)
                .align(Alignment.TopCenter)
        ) {
            Text(
                text = "From Fir",
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(16.dp),
                fontSize = 35.sp,
                color = Color.Gray,
                fontFamily = FontFamily.Monospace
            )
        }
        Box(
            modifier = Modifier
                .size(450.dp)
                .background(Color.Magenta)
                .align(Alignment.BottomCenter)

        ) {
            androidx.compose.foundation.layout.Column(modifier = Modifier.align(Alignment.Center)) {

                Text(
                    text = "HappyBirthday",
                    modifier = Modifier.padding(16.dp),
                    color = Color.White,
                    fontSize = 55.sp,
                )
                Spacer(modifier = Modifier.size(8.dp))
                Text(
                    text = "Víctor",
                    modifier = Modifier
                        .padding(16.dp)
                        .align(Alignment.CenterHorizontally),
                    color = Color.White,
                    fontSize = 120.sp,
                    fontFamily = FontFamily.Cursive
                )

            }
        }
    }
}
