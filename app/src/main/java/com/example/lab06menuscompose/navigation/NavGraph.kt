package com.example.lab06menuscompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.lab06menuscompose.screens.FavoritesScreen
import com.example.lab06menuscompose.screens.HomeScreen
import com.example.lab06menuscompose.screens.InfoScreen
import com.example.lab06menuscompose.screens.ProfileScreen
import com.example.lab06menuscompose.screens.SettingsScreen

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Profile : Screen("profile")
    object Settings : Screen("settings")
    object Favorites : Screen("favorites")
    object Info : Screen("info")
}

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) { HomeScreen(navController) }
        composable(Screen.Profile.route) { ProfileScreen() }
        composable(Screen.Settings.route) { SettingsScreen() }
        composable(Screen.Favorites.route) { FavoritesScreen() }
        composable(Screen.Info.route) { InfoScreen() }
    }
}
