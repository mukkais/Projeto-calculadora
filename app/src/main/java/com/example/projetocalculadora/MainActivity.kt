package com.example.projetocalculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projetocalculadora.ui.theme.ProjetoCalculadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjetoCalculadoraTheme {
                ProjetoCalcularGorjeta()

                }
            }
        }
    }

@OptIn(ExperimentalMaterial3Api::class)
@Preview (showSystemUi = true)
@Composable
fun ProjetoCalcularGorjeta() {
    var totalDaConta by remember { mutableStateOf("") }
    Box {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),

                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Um(text = "calculador de gorjeta ")
                TextField(
                    value ="",
                    onValueChange={totalDaConta =it},
                    label ={
                        Text (text="calculador de gorjeta")
                    }

                )
                Spacer(modifier = Modifier.size(10.dp))
                Dois(text = "total da gorjeta : R$0,00")

            }
        }


    }
}


@Composable
fun Um(text:String){
    Text(
        text = text,
        fontSize = 18.sp,
        fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,
        color = Color.Black,
        textAlign = TextAlign.Left,
        modifier = Modifier.width(200.dp)

    )
}
@Composable
fun Dois(text:String){
    Text(
        text = text,
        fontSize = 36.sp,
        fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,
        color = Color.Black,
        textAlign = TextAlign.Justify,
        fontWeight = FontWeight(10),
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 30.dp,
                top = 30.dp,
                start = 30.dp,
                bottom = 30.dp
                )
    )
}
@Composable
fun Tres(text:String){
    Text(
        text = text,
        fontSize = 30.sp,
        fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,
        color = Color.White,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 8.dp)
    )
}