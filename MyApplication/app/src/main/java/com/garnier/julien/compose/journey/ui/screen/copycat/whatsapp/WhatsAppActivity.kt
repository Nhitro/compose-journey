package com.garnier.julien.compose.journey.ui.screen.copycat.whatsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.garnier.julien.compose.journey.ui.screen.copycat.whatsapp.home.WhatsAppHomeScreen
import com.garnier.julien.compose.journey.ui.screen.copycat.whatsapp.theme.WhatsAppTheme

class WhatsAppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsAppTheme {
                WhatsAppHomeScreen()
            }
        }
    }
}