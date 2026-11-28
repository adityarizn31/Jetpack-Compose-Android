package com.example.jetpack

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Weight2f(){
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .weight(1F).height(100.dp).background(Color.Blue)
        )

        Box(
            modifier = Modifier
                .weight(1f).height(100.dp).background(Color.Red)
        )

        Box(
            modifier = Modifier
                .weight(1f).height(100.dp).background(Color.Green)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun myWeightPreview(){
    Weight2f()
}
