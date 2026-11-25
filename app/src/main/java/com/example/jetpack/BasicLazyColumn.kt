package com.example.jetpack

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
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

@Composable
fun MyLazzyRow(modifier : Modifier = Modifier) {

    val categories = listOf(
        "Buku", "Laptop", "Tas", "Kunci"
    )

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(categories) { category ->
            Text(text = category)
        }
    }
}


@Composable
fun StudentList(modifier : Modifier = Modifier) {

    val students = listOf(
        "Aditya", "Salsabilasyah", "Juleha", "Intan"
    )

    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(students) { student ->
            Card(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(16.dp)
                ) {
                    Text(
                        text = student
                    )
                    Text(
                        text = "20104006"
                    )
                    Text(
                        text = "Mahasiswa"
                    )

                }
            }
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
        MyLazzyRow()
        StudentList()
    }
}
