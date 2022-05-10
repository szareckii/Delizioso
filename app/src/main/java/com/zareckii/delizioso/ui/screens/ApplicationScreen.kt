package com.zareckii.delizioso.ui.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zareckii.delizioso.navigation.NavigationThree
import com.zareckii.delizioso.ui.screens.login.LoginScreen
import com.zareckii.delizioso.ui.screens.login.LoginViewModel
import com.zareckii.delizioso.ui.screens.splash.SplashScreen

@Composable
fun ApplicationScreen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavigationThree.Splash.name) {
        composable(NavigationThree.Splash.name) { SplashScreen(navController) }
        composable(NavigationThree.Login.name) {
            val loginViewModel = hiltViewModel<LoginViewModel>()
            LoginScreen(loginViewModel = loginViewModel)
        }
    }
}