package com.marghclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import com.marghclone.presentation.tabs.HomeTab
import com.marghclone.presentation.tabs.ProfileTab
import com.marghclone.presentation.tabs.SavedTab
import com.marghclone.ui.theme.MarghCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarghCloneTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TabNavigator(HomeTab) {
                        Scaffold(
                            content = { paddingValues ->
                                Box(
                                    modifier = Modifier
                                        .padding(bottom = paddingValues.calculateBottomPadding())
                                ) {
                                    CurrentTab()
                                }
                            },
                            bottomBar = {
                                NavigationBar {
                                    TabNavigationItem(HomeTab)
                                    TabNavigationItem(SavedTab)
                                    TabNavigationItem(ProfileTab)
                                }
                            }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun RowScope.TabNavigationItem(tab: Tab) {
    val tabNavigator = LocalTabNavigator.current
    val isTabSelected = tabNavigator.current == tab

    NavigationBarItem(
        selected = isTabSelected,
        onClick = { tabNavigator.current = tab },
        icon = {
            tab.options.icon?.let { painter ->
                Icon(
                    painter = painter,
                    contentDescription = tab.options.title,
                )
            }
        },
        label = {
            Text(text = tab.options.title)
        }
    )
}