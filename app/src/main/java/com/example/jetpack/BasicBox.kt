package com.example.jetpack

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MateriBasicBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(200.dp)
            .background(Color.Blue),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = "Aditya RN",
            color = Color.White
        )
    }
}

@Composable
fun ComponenBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(200.dp)
            .background(Color.Red),
        contentAlignment = Alignment.BottomStart
    ) {
        Text(
            text = "Khalisa",
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MateriBasicBoxPreview() {
    Column {
        MateriBasicBox()
        ComponenBox()
    }
}
