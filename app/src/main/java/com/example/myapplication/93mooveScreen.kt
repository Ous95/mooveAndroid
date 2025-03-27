package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.CoursUiState
import com.example.myapplication.ui.CoursViewModel
import com.example.myapplication.ui.Datasource


@Composable
fun mooveApp(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = mooveScreen.Start.name,
        modifier = Modifier
    ) {
        composable(route = mooveScreen.Start.name) {
            PageAccueil(
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center),
                navController=navController
            )
        }
        composable(route = mooveScreen.Login.name) {
            FormulaireLogin(
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center),
                navController=navController
            )
        }
        composable(route = mooveScreen.AfficherCours.name) {
            ListeCours(
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center),
                Datasource.retourneListeCours(),
                navController=navController
            )
        }
    }


    }

@Composable
fun ListeCours(modifier: Modifier,
               listeCours: List<CoursUiState>,

               navController: NavHostController = rememberNavController(),) {

    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(listeCours.size) { index ->
            val cours = listeCours[index]
            Card(modifier = Modifier.padding(8.dp)) {
                Text(
                    text = cours.nom,
                    modifier = Modifier.padding(16.dp)
                )

            }
        }
    }

}

@Composable
fun FormulaireLogin(modifier: Modifier,
                    navController: NavHostController = rememberNavController(),
) {
    var login by remember { mutableStateOf("") }

    val backgroundColor = if (login.length >= 10) {
        Color.Red
    } else {
        Color.White
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        TextField(
            label = { Text("Entrez votre login") },
            modifier = Modifier.background(backgroundColor),
            value = login,
            onValueChange = { login = it }
            ,colors = TextFieldDefaults.colors(unfocusedContainerColor = backgroundColor,focusedContainerColor=backgroundColor),

        )
        Button(onClick = {}) {
            Text("Valider")
        }


    }
}

@Composable
fun PageAccueil(modifier: Modifier,
                coursViewModel: CoursViewModel = viewModel(),
                navController: NavHostController = rememberNavController()) {
    val coursUiState by coursViewModel.uiState.collectAsState()
    val imageModifier = Modifier
        .size(200.dp)
        .clip(RoundedCornerShape(16.dp))

    //val image = painterResource(R.drawable.logo)
    Column(
        verticalArrangement = Arrangement.Center,
    )
    {
//        Image(
//            //painter = image,
//            contentDescription = "logo 93Moove",
//            modifier = imageModifier
//        )
        Text(coursUiState.nom)
        Text(
            text = "93 Moove " +
                    "Bienvenue",
            fontSize = 36.sp,
            lineHeight = 116.sp,
        )
        Button(onClick = {navController.navigate(mooveScreen.AfficherCours.name)}) {
            Text("Consulter les cours")
        }


        Button(onClick = {navController.navigate(mooveScreen.Login.name)}) {
            Text("Se connecter")
        }


    }

        }










