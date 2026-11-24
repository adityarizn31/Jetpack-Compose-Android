package com.example.jetpack

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyLazyColumn(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        item {
            Text("Nama Mahasiswa")
        }

        item {
            Text("Alamat")
        }

        item {
            Text("Jurusan")
        }
    }
}

@Composable
fun MyLazzyColumn(modifier: Modifier = Modifier) {
    val names = listOf(
        "Adlan", "Budi", "Nur", "Octa", "",
    )

    LazyColumn(modifier = modifier) {
        items(names.size) { index ->
            Text(
                text = names[index]
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyLazyColumnPreview() {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        MyLazyColumn()
        MyLazzyColumn()
    }
}
