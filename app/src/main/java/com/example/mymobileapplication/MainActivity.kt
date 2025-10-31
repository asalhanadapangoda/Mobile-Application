package com.example.mymobileapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.mymobileapplication.ui.theme.MyMobileApplicationTheme
import com.example.mymobileapplication.UICard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMobileApplicationTheme {
                UICard()
            }
        }
    }
}