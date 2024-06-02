package com.example.lenscorpsassignment.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.lenscorpsassignment.ui.theme.data.repository.DataRepository
import com.example.lenscorpsassignment.ui.theme.utils.LocalFont

/**
 * Top menu bar that contains the navigation buttons,
 * the buttons are not functional but we can customize them with jetpack navigation library to different screens.
 * @author Suryanshu
 */
@Composable
fun TopMenuBar(repository: DataRepository) {
    LazyRow {
        items(repository.getActivityHeaderList()) {

            GradientButton(
                brush = Brush.verticalGradient(listOf(Color(0xFF0E5DB3), Color(0xFF07325F))),
                localFont = LocalFont.localFont,
                buttonText = it
            )
            Text(
                text = "", modifier = Modifier
                    .width(1.dp)
                    .height(48.dp)
                    .background(
                        brush = Brush.verticalGradient(
                            listOf(
                                Color(0xFF0E5DB3),
                                Color(0xFF07325F)
                            )
                        )
                    )
                    .padding(top = 5.dp, bottom = 5.dp)
                    .border(1.dp, Color.White)
            )
        }
    }
}