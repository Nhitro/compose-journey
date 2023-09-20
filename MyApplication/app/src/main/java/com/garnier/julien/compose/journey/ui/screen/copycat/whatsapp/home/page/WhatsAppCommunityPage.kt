package com.garnier.julien.compose.journey.ui.screen.copycat.whatsapp.home.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.garnier.julien.compose.journey.R
import com.garnier.julien.compose.journey.ui.theme.WhatsAppColor

@Composable
fun WhatsAppCommunityPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(id = R.drawable.icon_community_contact),
            contentDescription = null,
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            text = "Restez en contact avec une communauté",
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center,
            color = Color.Black,
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 6.dp)
                .padding(horizontal = 16.dp),
            text = "Les communautés rassemblent des membres dans des groupes spécifiques et facilitent l'envoi des annonces d'admin. Toute communauté à laquelle vous êtes ajouté apparaîtra ici.",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            color = Color.Black,
        )

        TextButton(onClick = { /*TODO*/ }) {
            Text(
                "Afficher des exemples de communautés",
                style = MaterialTheme.typography.displaySmall,
                color = WhatsAppColor.ContentSecondary,
            )
            Icon(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = R.drawable.icon_chevron_right),
                contentDescription = null,
                tint = WhatsAppColor.ContentSecondary,
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(containerColor = WhatsAppColor.BackgroundPrimary),
            onClick = { /*TODO*/ }) {
            Text(
                "Lancer votre communauté",
                style = MaterialTheme.typography.displaySmall,
                color = WhatsAppColor.ContentPrimary,
            )
        }
    }
}

@Composable
@Preview
fun WhatsAppCommunityPagePreview() {
    WhatsAppCommunityPage()
}