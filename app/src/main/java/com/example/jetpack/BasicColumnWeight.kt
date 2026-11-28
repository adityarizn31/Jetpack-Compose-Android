package com.example.jetpack

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun myColumnWeight() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .weight(1f, fill = true)
                .fillMaxWidth()
                .background(Color.Blue)
        )

        Box(
            modifier = Modifier
                .weight(2f)
                .fillMaxWidth()
                .background(Color.Red)
        )
    }
}


@Composable
@Preview (showBackground = true)
fun myPreviewColumn() {
    myColumnWeight()
}