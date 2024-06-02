package com.example.lenscorpsassignment.ui.theme.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lenscorpsassignment.ui.theme.utils.LocalFont

/**
 * DetailCard Screen to show the detail of each card
 * @author Suryanshu
 */
@Composable
fun DetailCard(modifier: Modifier = Modifier, heading:String,content:String) {
    Column(modifier = Modifier.fillMaxWidth()){
        Text(modifier = Modifier.padding(5.dp),
            text = heading,
            fontSize = 40.sp,
            color = Color.Blue,
            fontFamily = LocalFont.localFont,
            fontWeight = FontWeight.Bold,
            lineHeight = 50.sp
        )
        Text(modifier = Modifier.padding(top = 40.dp).padding(5.dp),
            text = content,
            fontFamily = LocalFont.localFont,
            fontSize = 19.sp
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun Detailprev() {
    DetailCard(heading = "Indian Railway Promotee Officers Federation (IRPOF)", content = "Indian Railways Promotee Officers Federation (IRPOF) is an organization of Promotee officers having its Head Quarter at New Delhi. It functions through its member associations. Zonal Associations functions through divisional bodies across all the 69 divisions of Indian Railways. The aim of the federation is to safeguard interests of promotee officers and provide better career opportunities and working conditions. It works for development and promoting overall efficiency in the working of Railways in the best interest of common people, the nation and the Railway Men.\n" +
            "\n" +
            "IRPOF Has Launched This Site To Keep Its Member Informed About The, Latest Activities And Share Views On Topics Of Importance. All The Members Are Requested To Kindly Contribute To Make The Site Useful And Meaningful.")
}