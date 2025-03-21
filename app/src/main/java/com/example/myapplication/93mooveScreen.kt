package com.example.myapplication


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.MainActivity.mooveScreen
import com.example.myapplication.ui.CoursViewModel
import org.w3c.dom.Text

@Composable
fun mooveApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = mooveScreen.Start.name,
        modifier = Modifier
    ) {


    }
    @Composable
    fun PageAccueil(
        modifier: Modifier = Modifier, navController: NavController = rememberNavController()
    ) {


        Button(onClick = {
            navController.navigate(mooveScreen.Login.name){
                popUpTo(mooveScreen.Start.name){ inclusive=false }
            }
        }) {
            Text(
                text = "Consulter les cours",
                fontSize = 38.sp,
                lineHeight = 150.sp
            )
        }


    }
}



