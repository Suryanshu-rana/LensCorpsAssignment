package com.example.lenscorpsassignment.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.example.lenscorpsassignment.R
import com.example.lenscorpsassignment.ui.theme.utils.LocalFont

/**
 * It contains the logo, search bar, contact button
 * @author Suryanshu
 */
@Composable
fun TopHeaderLogo() {
    var searchText by remember { mutableStateOf("") }
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current
    var isFocused by remember { mutableStateOf(false) }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 19.dp, bottom = 5.dp)

    ) {
        Image(
            modifier = Modifier
                .sizeIn(
                    minWidth = 70.dp,
                    minHeight = 70.dp,
                    maxHeight = 100.dp,
                    maxWidth = 100.dp
                ),
            painter = painterResource(id = R.drawable.railwayimage),
            contentDescription = "Image Icon",
            contentScale = ContentScale.Crop
        )
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(0.2f)
                .fillMaxWidth()
                .onFocusChanged { focusState -> isFocused = focusState.isFocused },
            value = searchText,
            onValueChange = { searchText = it },
            placeholder = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "SearchIcon"
                )
            },
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = MaterialTheme.colorScheme.background,
                unfocusedIndicatorColor = MaterialTheme.colorScheme.background,
                unfocusedContainerColor = Color.White
            ),
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(
                onSearch = {
                    keyboardController?.hide()
                    //Perform search and close action here
                    searchText = "" //Clear text field
                    focusManager.clearFocus() //Clear focus
                }
            ),

            )
        GradientButton(
            brush = Brush.horizontalGradient(listOf(Color(0xFFDB2626), Color(0xFF811D1D))),
            localFont = LocalFont.localFont,
            shape = RoundedCornerShape(10.dp),
            buttonText = "Contact Us"
        )
    }
}