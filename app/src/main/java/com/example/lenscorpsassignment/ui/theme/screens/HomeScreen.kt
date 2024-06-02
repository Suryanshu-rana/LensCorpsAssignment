package com.example.lenscorpsassignment.ui.theme.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lenscorpsassignment.ui.theme.data.repository.DataRepository

/**
 * Home Screen is the entry point of the UI
 * @author Suryanshu
 */
@Composable
fun HomeScreen(
    innerPadding: PaddingValues,
    repository: DataRepository
) {
    val selectedItemDetail = remember { mutableStateOf(repository.getContentDataList()[0]) }
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(innerPadding)
            .verticalScroll(rememberScrollState())

    ) {
        //Contains the logo, search and Contact Us button
        TopHeaderLogo()
        //Represent the top menu bar to naviget to different screens
        TopMenuBar(repository)
        //Show the moving images with arrow
        ImageCarousel(list = repository.getImageList())
        //Latest moving headline is show
        LatestHeadlineBar()
        Column(
            modifier = Modifier
                .padding(horizontal = 30.dp)
                .padding(bottom = 30.dp)
        ) {
            //List of cards to show info
            TopicCard() {
                for (i in 0..4) {
                    when (it) {
                        repository.getTopicList()[i] -> {
                            selectedItemDetail.value = repository.getContentDataList()[i]
                        }
                    }
                }
            }
            //Containing Detail of every selected card
            DetailCard(
                heading = selectedItemDetail.value.heading,
                content = selectedItemDetail.value.content
            )
        }
        //Represent the bottom footer containing contact Info
        FooterScreen()
    }
}


@Preview(showSystemUi = true)
@Composable
private fun PreviewHeader() {
    HomeScreen(innerPadding = PaddingValues(10.dp), DataRepository())
}