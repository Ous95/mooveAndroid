@Composable
fun mooveApp(){
    PageAccueil(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}
@Composable
fun PageAccueil(modifier: Modifier=Modifier){
    Text("hello")
}