package com.example.boxtestkotlin

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.boxtestkotlin.ui.theme.BoxTestKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            BoxTest()
            BoxText()
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
                .size(500.dp, 100.dp)
                .background(Color.Red)
                .align(Alignment.TopCenter)
        )
        Box(
            modifier = Modifier
                .size(500.dp, 600.dp)
                .background(Color.Magenta)
                .align(Alignment.Center)
        )
    }


}

private fun BoxText(){

}
