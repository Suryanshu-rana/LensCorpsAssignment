package com.example.lenscorpsassignment.ui.theme.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Image Carousel to show images animation,
 * and the forward and backward buttons to move image explicitly
 * @author Suryanshu
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageCarousel(list:List<Int>) {
    val pageState = rememberPagerState(pageCount = { list.size })
    val coroutineScope = rememberCoroutineScope()
    LaunchedEffect(Unit) {
        while (true) {
            val nextPage = (pageState.currentPage + 1) % pageState.pageCount
            delay(1500)
            pageState.animateScrollToPage(nextPage)
        }
    }
    Box(contentAlignment = Alignment.Center) {
        HorizontalPager(state = pageState) { currentPage ->
            Image(
                painter = painterResource(id = list[currentPage]),
                contentDescription = "Images"
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                modifier = Modifier
                    .background(Color.White.copy(alpha = 0.4f))
                    .clickable {
                        coroutineScope.launch {
                            val previousPage = (pageState.currentPage - 1) % pageState.pageCount
                            pageState.animateScrollToPage(previousPage)
                        }
                    },
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "ArrowBack",
                tint = Color.Black.copy(alpha = 0.6f)
            )
            Icon(
                modifier = Modifier
                    .background(Color.White.copy(alpha = 0.4f))
                    .clickable {
                        coroutineScope.launch {
                            val nextPage = (pageState.currentPage + 1) % pageState.pageCount
                            pageState.animateScrollToPage(nextPage)
                        }
                    },
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "ArrowForward",
                tint = Color.Black.copy(alpha = 0.6f)
            )
        }
    }
}