package com.zareckii.delizioso.ui.screens.splash

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.zareckii.delizioso.navigation.NavigationThree

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(key1 = Unit, block = {
        navController.navigate(NavigationThree.Login.name)
    })
}