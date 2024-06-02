package com.example.lenscorpsassignment.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
/**
 * GradientButton Screen to create gradient button
 * @author Suryanshu
 */
@Composable
fun GradientButton(
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    brush: Brush,
    localFont: FontFamily,
    buttonText: String,
) {
    Box(
        modifier = Modifier
            .background(
                brush = brush,
                shape = shape
            )
    ) {
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            )
        ) {
            Text(
                text = buttonText,
                fontFamily = localFont,
                fontSize = 19.sp
            )
        }
    }
}
