package com.example.lenscorpsassignment.ui.theme.screens

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lenscorpsassignment.ui.theme.utils.LocalFont

/**
 * Card that represent each card and content to display on homepage.
 * @author Suryanshu
 */
@Composable
fun TopicCard(selectedTitle: (title: String) -> Unit) {
    var selectedItem by remember { mutableStateOf("Who we are: IRPOF") }

    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.elevatedCardElevation(4.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 90.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            CardItem(
                text = "Who we are: IRPOF",
                isSelected = selectedItem == "Who we are: IRPOF",
                onClick = {
                    selectedItem = "Who we are: IRPOF"
                    selectedTitle(selectedItem)
                }
            )
            Divider(color = Color.Gray, thickness = 1.dp)
            CardItem(
                text = "Mission & Vision",
                isSelected = selectedItem == "Mission & Vision",
                onClick = {
                    selectedItem = "Mission & Vision"
                    selectedTitle(selectedItem)
                }
            )
            Divider(color = Color.Gray, thickness = 1.dp)
            CardItem(
                text = "Recent Events",
                isSelected = selectedItem == "Recent Events",
                onClick = {
                    selectedItem = "Recent Events"
                    selectedTitle(selectedItem)
                }
            )
            Divider(color = Color.Gray, thickness = 1.dp)
            CardItem(
                text = "Images",
                isSelected = selectedItem == "Images",
                onClick = {
                    selectedItem = "Images"
                    selectedTitle(selectedItem)
                }
            )
            Divider(color = Color.Gray, thickness = 1.dp)
            CardItem(
                text = "Videos",
                isSelected = selectedItem == "Videos",
                onClick = {
                    selectedItem = "Videos"
                    selectedTitle(selectedItem)
                }
            )
        }
    }
}

@Composable
fun CardItem(text: String, isSelected: Boolean, onClick: () -> Unit) {
    val backgroundColor by animateColorAsState(if (isSelected) Color(0xFFE8F4FF) else Color.White)

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(96.dp)
            .clickable { onClick() }
            .background(backgroundColor)
    ) {
        if (isSelected) {
            Box(
                modifier = Modifier
                    .width(4.dp)
                    .fillMaxHeight()
                    .background(Color.Red)
            )
            Spacer(modifier = Modifier.width(8.dp))
        } else {
            Spacer(modifier = Modifier.width(12.dp))
        }
        Text(
            text = text,
            fontSize = 19.sp,
            fontFamily = LocalFont.localFont,
            color = Color(0xFF00008b)
        )
    }
}
