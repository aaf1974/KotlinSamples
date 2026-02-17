package com.aaf_example.simplesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.aaf_example.simplesample.ui.theme.SimpleSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleSampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // PASS BOTH ARGUMENTS HERE
                    Greeting(
                        name = "Android",
                        from = ".NET Developer",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// 2. The actual Component (Function signature changed!)
/*@Composable
fun Greeting(name: String, from: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name, from $from!",
        modifier = modifier
    )
}*/

// 3. The Preview (Must match the new signature)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SimpleSampleTheme {
        Greeting("Android", ".NET Pro")
    }
}