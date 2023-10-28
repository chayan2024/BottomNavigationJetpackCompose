package com.withjetpack.bottomnavigationjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.withjetpack.bottomnavigationjetpackcompose.ui.theme.BottomNavigationJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavigationJetpackComposeTheme {
                val navController = rememberNavController()
                // A surface container using the 'background' color from the theme
                MainScreenView(navController)
            }
        }
    }
}

@Composable
fun MainScreenView(navController: NavHostController) {
    Scaffold(
        bottomBar = { BottomNavigationS(navController = navController) }
    ) {
        NavigationGraph(navController = navController)
    }
}



@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BottomNavigationJetpackComposeTheme {
        Greeting("Android")
    }
}