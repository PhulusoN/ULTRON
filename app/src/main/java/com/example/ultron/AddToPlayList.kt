package com.example.ultron

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ultron.ui.theme.ULTRONTheme

class AddToPlayList : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ULTRONTheme {
                Column(
                    modifier = Modifier.fillMaxWidth(), //centering my columns
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally //centering my columns
                ) {
                    Spacer(modifier = Modifier.height(20.dp))

                    var songTitle by remember { mutableStateOf("") }
                    OutlinedTextField(
                        value = songTitle,
                        onValueChange = { songTitle = it },
                        label = { Text("Song Title") },
                        placeholder = { Text("Song Title") }
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    var artistName by remember { mutableStateOf("") }
                    OutlinedTextField(
                        value = artistName,
                        onValueChange = { artistName = it },
                        label = { Text("Artist Name") },
                        placeholder = { Text("Artist Name") }
                    )
                    Spacer(modifier = Modifier.height(20.dp))

                    var rating by remember { mutableStateOf("") }
                    OutlinedTextField(
                        value = rating,
                        onValueChange = { rating = it },
                        label = { Text("Rating") },
                        placeholder = { Text("Rating") }
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    var comment by remember { mutableStateOf("") }
                    OutlinedTextField(
                        value = comment,
                        onValueChange = { comment = it },
                        label = { Text("comment") },
                        placeholder = { Text("Comment") }
                    )
                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
                    ) {
                        ElevatedButton(onClick = {
                            val intent = Intent(this@AddToPlayList, AddToPlayList::class.java)
                            startActivity(intent)
                        }) {
                            Text("Save")
                        }

                        ElevatedButton(onClick = {
                            val intent = Intent(this@AddToPlayList, MainActivity::class.java)
                            startActivity(intent)
                        }) {
                            Text("Home")
                        }
                    }

                }

            }
        }
    }
}
