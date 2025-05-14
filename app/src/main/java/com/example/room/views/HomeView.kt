package com.example.room.views

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.room.components.FloatButton
import com.example.room.components.MainTitle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { MainTitle(title = "Cronos") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        },
        floatingActionButton = {
            FloatButton {
                navController.navigate(route = "AddView")
            }
        }
    ) { it: PaddingValues ->
        ContentHomeView(it, navController)
    }
}

@Composable
fun ContentHomeView(it: PaddingValues, navController: NavController) {
    Column(
        modifier = Modifier.padding(it)
    ) {
        // Aquí puedes colocar los elementos del contenido de Home
    }
}