package com.garnier.julien.compose.journey.ui.screen.copycat.whatsapp.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.garnier.julien.compose.journey.R
import com.garnier.julien.compose.journey.ui.custom.IconTabRow
import com.garnier.julien.compose.journey.ui.theme.ComposeJourneyTheme
import com.garnier.julien.compose.journey.ui.theme.WhatsAppColor

@Composable
@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
fun WhatsAppHomeScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text("WhatsApp", style = MaterialTheme.typography.titleMedium)
                },
                actions = {
                    IconButton(
                        modifier = Modifier.size(36.dp),
                        onClick = { /*TODO*/ })
                    { WhatsAppToolbarIcon(id = R.drawable.icon_photo_camera) }
                    Spacer(modifier = Modifier.size(5.dp))
                    IconButton(
                        modifier = Modifier.size(36.dp),
                        onClick = { /*TODO*/ }
                    ) { WhatsAppToolbarIcon(id = R.drawable.icon_search) }
                    Spacer(modifier = Modifier.size(5.dp))
                    IconButton(
                        modifier = Modifier.size(36.dp),
                        onClick = { /*TODO*/ }
                    ) {
                        WhatsAppToolbarIcon(id = R.drawable.icon_more)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = WhatsAppColor.BackgroundPrimary
                )
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            val pagerState = rememberPagerState(initialPage = 1) { 4 }
            val scope = rememberCoroutineScope()
            val currentPage = pagerState.currentPage

            IconTabRow(
                selectedTabIndex = currentPage,
                containerColor = WhatsAppColor.BackgroundPrimary,
                iconTabWidthInDp = 100.dp,
                indicatorColor = WhatsAppColor.ContentPrimary,
                divider = {}
            ) {
                WhatsAppIconTab(
                    pagerState = pagerState,
                    scope = scope,
                    icon = R.drawable.icon_group,
                    tabIndex = 0,
                )

                val tabsTextContent = listOf("Disc.", "Statut", "Appels")

                tabsTextContent.forEachIndexed { index, text ->
                    WhatsAppTextTab(
                        pagerState = pagerState,
                        text = text,
                        pageIndex = index + 1,
                        scope = scope
                    )
                }

            }

            HorizontalPager(
                state = pagerState,
                modifier = Modifier.fillMaxSize()
            ) {}
        }
    }
}

@Composable
fun WhatsAppToolbarIcon(@DrawableRes id: Int) {
    Icon(
        painter = painterResource(id = id),
        contentDescription = null,
        modifier = Modifier.size(24.dp),
        tint = WhatsAppColor.ContentPrimary
    )
}

@Preview(showBackground = true)
@Composable
fun WhatsAppHomeScreenPreview() {
    ComposeJourneyTheme {
        WhatsAppHomeScreen()
    }
}