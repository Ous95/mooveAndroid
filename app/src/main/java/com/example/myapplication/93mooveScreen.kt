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
import com.example.myapplication.ui.CoursViewModel
import org.w3c.dom.Text

@Composable
fun mooveApp(){
    PageAccueil(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}
@Composable
fun PageAccueil(modifier: Modifier=Modifier, coursViewModel: CoursViewModel= viewModel()
) {
    val coursUiState by coursViewModel.uiState.collectAsState()

    Text(coursUiState.nom)

    Button(onClick={}){
        Text(
            text = "Consulter les cours",
            fontSize = 38.sp,
            lineHeight = 150.sp
        )
    }



}

