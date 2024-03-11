package com.marghclone.presentation.tabs.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage
import com.marghclone.data.model.Quote

@Composable
fun QuoteContent(quote: Quote) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        AsyncImage(
            model = quote.imageUrl,
            contentDescription = "",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier.fillMaxHeight()
        )
        Footer()
    }
}