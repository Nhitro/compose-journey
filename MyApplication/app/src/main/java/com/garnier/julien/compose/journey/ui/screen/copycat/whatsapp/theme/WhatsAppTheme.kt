package com.garnier.julien.compose.journey.ui.screen.copycat.whatsapp.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import com.garnier.julien.compose.journey.ui.theme.WhatsAppColor
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorScheme = darkColorScheme(
    primary = WhatsAppColor.BackgroundPrimary,
    secondary = WhatsAppColor.BackgroundPrimary,
    tertiary = WhatsAppColor.BackgroundPrimary,
    background = WhatsAppColor.BackgroundPrimary,
)

private val LightColorScheme = lightColorScheme(
    primary = WhatsAppColor.BackgroundPrimary,
    secondary = WhatsAppColor.BackgroundPrimary,
    tertiary = WhatsAppColor.BackgroundPrimary,
    background = WhatsAppColor.BackgroundPrimary,

    /* Other default colors to override
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)


@Composable
fun WhatsAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit,
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    val systemUiController = rememberSystemUiController()

    if (!view.isInEditMode) {
        SideEffect {
            systemUiController.setStatusBarColor(WhatsAppColor.BackgroundPrimary)
        }
    }
    MaterialTheme(
        colorScheme = colorScheme,
        typography = WhatsAppTypography,
        content = content,
    )
}