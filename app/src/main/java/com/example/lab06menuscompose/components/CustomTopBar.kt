package com.example.lab06menuscompose.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.lab06menuscompose.navigation.Screen
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar(navController: NavHostController) {
    CenterAlignedTopAppBar(
        navigationIcon = {
            IconButton(onClick = { /* TODO: abrir drawer */ }) {
                Icon(Icons.Rounded.Menu, contentDescription = "Menú")
            }
        },
        title = { Text("Mi App") },
        actions = {
            IconButton(onClick = { /* TODO: búsqueda */ }) {
                Icon(Icons.Rounded.Search, contentDescription = "Buscar")
            }
            IconButton(onClick = { navController.navigate(Screen.Profile.route) }) {
                Icon(Icons.Outlined.AccountCircle, contentDescription = "Perfil")
            }
        }
    )
}
