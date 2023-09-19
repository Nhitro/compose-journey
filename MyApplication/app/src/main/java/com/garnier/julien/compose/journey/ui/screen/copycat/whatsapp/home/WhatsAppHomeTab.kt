package com.garnier.julien.compose.journey.ui.screen.copycat.whatsapp.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.garnier.julien.compose.journey.ui.theme.WhatsAppColor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun WhatsAppTextTab(
    pagerState: PagerState,
    text: String,
    pageIndex: Int,
    scope: CoroutineScope,
) {
    val isTabSelected = pagerState.currentPage == pageIndex

    Tab(
        selected = isTabSelected,
        onClick = { scope.launch { pagerState.animateScrollToPage(pageIndex) } },
        modifier = Modifier.height(42.dp)
    ) {
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleSmall,
            text = text,
            color =
            if (isTabSelected) WhatsAppColor.ContentPrimary
            else WhatsAppColor.ContentPrimaryDisabled
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun WhatsAppIconTab(
    pagerState: PagerState,
    @DrawableRes icon: Int,
    tabIndex: Int,
    scope: CoroutineScope
) {
    val isTabSelected = pagerState.currentPage == tabIndex

    Tab(
        modifier = Modifier.size(8.dp),
        selected = isTabSelected,
        onClick = { scope.launch { pagerState.animateScrollToPage(0) } }
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier.padding(horizontal = 8.dp),
            tint = if (isTabSelected) WhatsAppColor.ContentPrimary else WhatsAppColor.ContentPrimaryDisabled
        )
    }
}