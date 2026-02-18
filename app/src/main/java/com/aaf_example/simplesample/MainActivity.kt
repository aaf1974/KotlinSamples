package com.aaf_example.simplesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aaf_example.simplesample.ui.theme.SimpleSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleSampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // PASS BOTH ARGUMENTS HERE
//                    Greeting(
//                        name = "Android",
//                        from = ".NET Developer",
//                        modifier = Modifier.padding(innerPadding)
//                    )

                    val navController = rememberNavController() // Создаем контроллер

                    NavHost(
                        navController = navController,
                        startDestination = "home" // Аналог Route в ASP.NET
                    ) {
                        // Маршрут 1: Главный экран
                        composable("home") {
                            Greeting(
                                name = "Android",
                                from = ".NET Pro",
                                modifier = Modifier.padding(innerPadding),
                                // Передаем действие перехода во второй экран
                                onNavigateToSecond = { navController.navigate("second") }
                            )
                        }

                        // Маршрут 2: Второй экран
                        composable("second") {
                            SecondScreen(
                                onBack = { navController.popBackStack() }, // Аналог GoBack()
                                modifier = Modifier.padding(innerPadding)
                            )
                        }
                    }
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
        Greeting("Android", ".NET Pro", onNavigateToSecond = {})
    }
}