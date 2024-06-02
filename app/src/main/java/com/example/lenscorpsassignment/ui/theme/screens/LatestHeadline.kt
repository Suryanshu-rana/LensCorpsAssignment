package com.example.lenscorpsassignment.ui.theme.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lenscorpsassignment.ui.theme.utils.LocalFont

/**
 * Composable that creates the headline bar with moving headline in it.
 * @author Suryanshu
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LatestHeadlineBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
    ) {
        Text(
            text = "Latest Headline",
            fontSize = 17.sp,
            modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFF811D1D),
                            Color(0xFFDB2626)
                        )
                    )
                )
                .fillMaxHeight()
                .padding(top = 5.dp, start = 10.dp, end = 10.dp)
                .widthIn(max = 80.dp),
            fontFamily = LocalFont.localFont,
            overflow = TextOverflow.Visible,
            color = Color.White,
        )
        Text(
            text = "The national single window system has access to over 100 central level approvals and state single window systems of 14 states/uTs with one user Id and password",
            fontSize = 15.sp,
            modifier = Modifier
                .background(
                    brush = Brush.verticalGradient(
                        listOf(
                            Color(0xFF0E5DB3),
                            Color(0xFF07325F)
                        )
                    ),
                )
                .fillMaxHeight()
                .padding(10.dp)
                .fillMaxWidth()
                .basicMarquee(
                    iterations = Int.MAX_VALUE,
                    delayMillis = 0,
                    initialDelayMillis = 0,
                    velocity = 50.dp
                )
                .wrapContentHeight(),
            textAlign = TextAlign.Center,
            fontFamily = LocalFont.localFont,
            overflow = TextOverflow.Ellipsis,
            color = Color.White
        )
    }
}