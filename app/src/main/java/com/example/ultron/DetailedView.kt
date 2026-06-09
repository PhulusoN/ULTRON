package com.example.ultron

import android.R.attr.onClick
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ultron.ui.theme.ULTRONTheme

class DetailedView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ULTRONTheme {
                Column(modifier = Modifier.fillMaxSize(), //centering my columns
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally ){
                    Spacer(modifier = Modifier.height(20.dp))

                    var DisplayLIst by remember { mutableStateOf("") }
                    OutlinedTextField(
                        value = DisplayLIst,
                        onValueChange = { DisplayLIst = it },
                        label = { Text("Display list") },
                        placeholder = { Text("Display list") }
                    )

                    var AvarageRating by remember { mutableStateOf("") }
                    OutlinedTextField(
                        value = AvarageRating,
                        onValueChange = { AvarageRating = it },
                        label = { Text("Detailed View") },
                        placeholder = { Text("Detailed View") }
                    )

                    ElevatedButton(onClick = {
                        val intent = Intent(this@DetailedView, MainActivity::class.java)
                        startActivity(intent)
                    }) {
                        Text("Home")
                    }









                }



            }
        }
    }
}

