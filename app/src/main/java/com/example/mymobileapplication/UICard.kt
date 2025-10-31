package com.example.mymobileapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun UICard() {

    Image(
        painterResource(R.drawable.background),
        contentDescription = "Background Image",
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(bottom = 165.dp)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, end = 16.dp),
            horizontalArrangement = Arrangement.Absolute.Right
        ) {
            repeat(4) { index ->
                Box(
                    modifier = Modifier
                        .size(40.dp, 4.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(
                            if (index == 0) Color(0xFFFFBF00) else Color(0xFFF1F1F1)
                        )
                )
                Spacer(modifier = Modifier.width(8.dp))
            }
        }
    }

    Column(
        modifier = Modifier.padding(start = 30.dp)
    ){
        Box(
            modifier = Modifier
                .padding(top = 430.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color(0xFFFFD700))
        ) {
            Text(
                text = "TECH",
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )

        }
        Text(
            text = "The Future of Urban Living",
            color = Color.White,
            fontSize = 35.sp,
            fontWeight = FontWeight.W400,
            modifier = Modifier.padding(top = 20.dp)
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 8.dp, top = 12.dp)
        ) {
            Text(
                text = "\uD83D\uDC64  Sarah Chen",
                color = Color(0xADDADADA),
                modifier = Modifier.padding(end = 16.dp)
            )
            Text(
                text = "\uD83D\uDD53  8 min read",
                color = Color(0xADDADADA),
                modifier = Modifier.padding(start = 8.dp)
            )
        }
    }

    Box(
        modifier = Modifier.padding(top = 615.dp)
    ) {
        NavigationBar(
            containerColor = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .height(64.dp)
        ) {
            NavigationBarItem(
                icon = {
                    Text(text = "\uD83D\uDCF0")
                },
                label = { Text("NEWS", color = Color.White) },
                selected = false,
                onClick = { /* Handle navigation */ },
                alwaysShowLabel = true
            )
            NavigationBarItem(
                icon = {
                    Text(text = "\uD83D\uDCE3")
                },
                label = { Text("PROMOS", color = Color.White) },
                selected = false,
                onClick = { /* Handle navigation */ },
                alwaysShowLabel = true
            )
            NavigationBarItem(
                icon = {
                    Text(text = "⚙\uFE0F")
                },
                label = { Text("SETTINGS", color = Color.White) },
                selected = false,
                onClick = { /* Handle navigation */ },
                alwaysShowLabel = true
            )
        }
    }


}
