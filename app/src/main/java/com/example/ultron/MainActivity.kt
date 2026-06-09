package com.example.ultron

import android.R.attr.onClick
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ultron.ui.theme.ULTRONTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ULTRONTheme {
                Column(
                    modifier = Modifier.fillMaxSize(), //centering my columns
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally //centering my columns

                ){

                    Text("Hello, Welcome to ULTRON")

                    ElevatedButton(
                        onClick = { val intent = Intent(
                            this@MainActivity,
                            AddToPlayList::class.java
                        )
                    startActivity(intent)})
                    {
                        Text("Add to playlist")
                    }
                    ElevatedButton(
                        onClick = { val intent = Intent(
                            this@MainActivity,
                            DetailedView::class.java
                        )
                            startActivity(intent)})

                    {
                        Text("Detailed View")
                    }

                    ElevatedButton(onClick = {finishAffinity()
                    }){
                        Text("Exit")
                    }
                }

            }
        }
    }
}



