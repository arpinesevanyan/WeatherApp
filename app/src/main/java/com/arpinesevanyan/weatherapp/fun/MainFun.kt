package com.arpinesevanyan.weatherapp.`fun`

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.arpinesevanyan.weatherapp.R
import com.arpinesevanyan.weatherapp.ui.theme.BlueLight


@Preview(showBackground = true)
@Composable
fun MainFun() {
    Image(
        painter = painterResource(id = R.drawable.background_app),
        contentDescription = "im1",
        modifier = Modifier
            .fillMaxSize()
            .alpha(0.7f),
        contentScale = ContentScale.FillBounds,
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = BlueLight,
            elevation = 0.dp,
            shape = RoundedCornerShape(10.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "28 Jan 2023",
                        style = TextStyle(fontSize = 15.sp),
                        color = Color.White,
                        modifier = Modifier.padding(top = 8.dp, start = 8.dp)
                    )
                    AsyncImage(
                        model = "https://cdn.weatherapi.com/weather/64x64/day/116.png",
                        contentDescription = "im2",
                        modifier = Modifier.size(35.dp)
                    )
                }
            }
        }
    }
}