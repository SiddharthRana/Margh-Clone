package com.marghclone.presentation.tabs.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.marghclone.R

@Composable
fun Header() {
    Row {
        Box(
            modifier = Modifier
                .weight(0.5f)
                .height(50.dp),
            contentAlignment = Alignment.Center
        ) {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxSize(),
                shape = RoundedCornerShape(5.dp),
            ) {
                Text(
                    text = "Random Quotes",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                )
            }
        }
        Spacer(modifier = Modifier.padding(horizontal = 4.dp))
        Box(
            modifier = Modifier
                .weight(0.6f)
                .height(50.dp)
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxSize(),
                shape = RoundedCornerShape(50.dp),
                enabled = false,
                leadingIcon = {
                    Icon(Icons.Filled.Search, "Search")
                },
                trailingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.ic_mic),
                        contentDescription = "",
                    )
                },
            )
        }
    }
}