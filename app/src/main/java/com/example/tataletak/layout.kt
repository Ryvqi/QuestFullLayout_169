package com.example.tataletak

import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun Layout(modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxSize()) {
        TampilanHeader()
    }
}

@Composable
fun TampilanHeader(){
    Box(modifier = Modifier.fillMaxWidth().
        background(color = Color.DarkGray)){
        Row {
            Box(contentAlignment = Alignment.BottomEnd){
                Image(painterResource(R.drawable.),
                    contentDescription = null)
            }
        }
    }
}