package com.example.myapplication

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.content.MediaType.Companion.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplication.ui.CoursViewModel
import com.example.myapplication.ui.CoursUiState
import com.example.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


            MyApplicationTheme {
                mooveApp()
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Ousman",
//                        modifier = Modifier.padding(innerPadding)
//
//
//                    )
//                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    val image= painterResource(R.drawable.smiley)
//    Column (verticalArrangement = Arrangement.Center){
//        Text(
//            text = "Hello $name!",
//            fontSize = 38.sp,
//            lineHeight = 150.sp
//        )
//        Image(
//            painter = image,
//            contentDescription = "Smiley"
//        )
//
//
//        Text(
//            text = "abcde",
//            modifier = modifier,
//            fontSize = 38.sp,
//            lineHeight = 150.sp
//        )
//    }
//
//}
//
//
//
//
//
//@Preview
//@Composable
//fun HelloPreview(modifier: Modifier=Modifier, coursViewModel: CoursViewModel= viewModel()) {
//    MyApplicationTheme {
//
//        Surface(
//            modifier = Modifier.fillMaxSize(),
//            color = MaterialTheme.colorScheme.surfaceBright,
//
//        ){
//
//
//        }
//        val coursUiState by coursViewModel.uiState.collectAsState()
//
//        Text(coursUiState.nom)
//
//
//    }










