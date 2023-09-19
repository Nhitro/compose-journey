package com.garnier.julien.compose.journey.ui.screen.copycat.whatsapp.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.garnier.julien.compose.journey.R
import com.garnier.julien.compose.journey.ui.theme.WhatsAppColor

private val helveticaFontFamily = FontFamily(
    Font(R.font.helvetica_regular, FontWeight.Normal),
    Font(R.font.helvetica_medium, FontWeight.Medium),
    Font(R.font.helvetica_bold, FontWeight.Bold),
)

val WhatsAppTypography = Typography(
    titleMedium = TextStyle(
        color = WhatsAppColor.ContentPrimary,
        fontSize = 22.sp,
        fontFamily = helveticaFontFamily,
        fontWeight = FontWeight.Normal,
    ),
    titleSmall = TextStyle(
        color = WhatsAppColor.ContentPrimary,
        fontSize = 15.sp,
        fontFamily = helveticaFontFamily,
        fontWeight = FontWeight.Normal,
    )
)
