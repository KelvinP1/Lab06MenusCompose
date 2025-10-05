package com.example.lab06menuscompose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.navigation.NavHostController
import com.example.lab06menuscompose.navigation.Screen

@Composable
fun CustomBottomBar(navController: NavHostController) {
    BottomAppBar(
        containerColor = MaterialTheme.colorScheme.primaryContainer
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            IconButton(onClick = { navController.navigate(Screen.Settings.route) }) {
                Icon(Icons.Filled.Settings, contentDescription = "Configuración")
            }
            IconButton(onClick = { navController.navigate(Screen.Home.route) }) {
                Icon(Icons.Filled.Home, contentDescription = "Home")
            }
            IconButton(onClick = { navController.navigate(Screen.Favorites.route) }) {
                Icon(Icons.Filled.Favorite, contentDescription = "Favoritos")
            }
            IconButton(onClick = { navController.navigate(Screen.Info.route) }) {
                Icon(Icons.Filled.Info, contentDescription = "Información")
            }
        }
    }
}
