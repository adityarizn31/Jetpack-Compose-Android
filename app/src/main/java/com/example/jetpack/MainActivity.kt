package com.example.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Scaffold(
                modifier = Modifier.fillMaxSize()
            ) { innerPadding ->

                // Untuk menjalankan materi tertentu, cukup panggil Composable materinya di sini:

                // Materi 1
//                 Greeting(modifier = Modifier.padding(innerPadding))

                // Materi 2
//                MateriBasicBox(
//                    modifier = Modifier.padding(innerPadding)
//                )

                // Materi 3
//                ComponenBox(
//                    modifier = Modifier.padding(innerPadding)
//                )

                // Materi 4
                MyLazyColumn(
                    modifier = Modifier.padding(innerPadding)
                )

                // Materi 5
                MyLazzyColumn(
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("Welcome to Jetpack")
        Text("IT Support")
        Text("Silakan tekan tombol di bawah ini!")

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { println("Memulai aplikasi IT Support") }
            ) {
                Text("Mulai")
            }
        }

        Box(
            modifier = Modifier
                .size(200.dp)
                .background(Color.Blue),
            contentAlignment = Alignment.Center
        ) {
            Text("Aditya", color = Color.White)
        }

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                Text("Server Monitoring ")
                Text("Server Online : 20")
                Text("Server Offline : 10")
            }
        }

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedButton(
                onClick = { println("Klik") }
            ) {
                Text("GNR")
            }
        }

        Box(
            modifier = Modifier
                .size(200.dp)
                .background(Color.Blue),
            contentAlignment = Alignment.Center
        ) {
            Text("Aditya RN", color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting()
    
}
