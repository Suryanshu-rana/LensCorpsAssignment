package com.example.lenscorpsassignment.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lenscorpsassignment.R
import com.example.lenscorpsassignment.ui.theme.utils.LocalFont
/**
 * Footer Screen to show the detail of footer
 * @author Suryanshu
 */
@Composable
fun FooterScreen() {
    Box(
        modifier = Modifier
            .background(
                Brush.linearGradient(
                    listOf(
                        Color(0xFF0E5DB3),
                        Color(0xFF07325F)
                    )
                )
            )
    ) {
        Image(modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.bgimage),
            contentDescription = "background Image",
            contentScale = ContentScale.Inside,
            alpha = 0.1f
        )
        Column(modifier = Modifier.padding(40.dp), verticalArrangement = Arrangement.SpaceEvenly) {
            Box(
                modifier = Modifier
                    .sizeIn(
                        minWidth = 70.dp,
                        minHeight = 70.dp,
                        maxHeight = 100.dp,
                        maxWidth = 100.dp
                    )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.railwayimage),
                    contentDescription = "Image Icon",
                    contentScale = ContentScale.Crop
                )
            }
            Row(
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .height(20.dp)
                    .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = "Facebook Icon",
                    tint = Color.White
                )
                Icon(
                    painter = painterResource(id = R.drawable.instagram),
                    contentDescription = "Facebook Icon",
                    tint = Color.White
                )
                Icon(
                    painter = painterResource(id = R.drawable.linkedin),
                    contentDescription = "Facebook Icon",
                    tint = Color.White
                )
                Icon(
                    painter = painterResource(id = R.drawable.discord),
                    contentDescription = "Facebook Icon",
                    tint = Color.White
                )
                Icon(
                    painter = painterResource(id = R.drawable.twitter),
                    contentDescription = "Facebook Icon",
                    tint = Color.White
                )
            }
            Text(
                modifier = Modifier.padding(vertical = 10.dp),
                text = "Important Links",
                fontFamily = LocalFont.localFont,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                modifier = Modifier.padding(vertical = 5.dp),
                text = "Home",
                fontFamily = LocalFont.localFont,
                color = Color.White
            )
            Text(
                modifier = Modifier.padding(vertical = 5.dp),
                text = "Organization",
                fontFamily = LocalFont.localFont,
                color = Color.White
            )
            Text(
                modifier = Modifier.padding(vertical = 5.dp),
                text = "Seniority",
                fontFamily = LocalFont.localFont,
                color = Color.White
            )
            Text(
                modifier = Modifier.padding(vertical = 5.dp),
                text = "Rules",
                fontFamily = LocalFont.localFont,
                color = Color.White
            )
            Text(
                modifier = Modifier.padding(vertical = 5.dp),
                text = "News/Article",
                fontFamily = LocalFont.localFont,
                color = Color.White
            )
            Text(
                modifier = Modifier.padding(vertical = 5.dp),
                text = "IRPOBF",
                fontFamily = LocalFont.localFont,
                color = Color.White
            )
            Text(
                modifier = Modifier.padding(vertical = 5.dp),
                text = "Links",
                fontFamily = LocalFont.localFont,
                color = Color.White
            )
            Text(
                modifier = Modifier.padding(vertical = 10.dp),
                text = "Contact Us",
                fontFamily = LocalFont.localFont,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Row(
                modifier = Modifier
                    .padding(vertical = 5.dp)
                    .fillMaxWidth()
            ) {
                Icon(
                    tint = Color.White,
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = "Location"
                )
                Text(
                    modifier = Modifier.padding(start = 10.dp),
                    text = "208/A-4, Railway Colony Basant Lane,Pahar Ganj, Delhi- 110 055",
                    fontFamily = LocalFont.localFont,
                    color = Color.White
                )
            }
            Row(modifier = Modifier.padding(vertical = 5.dp)) {
                Icon(
                    tint = Color.White,
                    imageVector = Icons.Default.Phone,
                    contentDescription = "Location"
                )
                Text(
                    modifier = Modifier.padding(start = 10.dp),
                    text = "42622924(DoT), 030-22924 030-23140(Rly.)",
                    fontFamily = LocalFont.localFont,
                    color = Color.White
                )
            }
            Row(modifier = Modifier.padding(vertical = 5.dp)) {
                Icon(
                    tint = Color.White,
                    imageVector = Icons.Default.Mail,
                    contentDescription = "Location"
                )
                Text(
                    modifier = Modifier.padding(start = 10.dp),
                    text = "Dummy@Railways.com",
                    fontFamily = LocalFont.localFont,
                    color = Color.White
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun FooterPreview() {
    FooterScreen()
}