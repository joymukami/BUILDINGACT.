package com.example.buildingact.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.buildingact.ui.theme.pages.about.AboutScreen
import com.example.buildingact.ui.theme.pages.home.HomeScreen
import com.example.buildingact.ui.theme.pages.login.LoginScreen
import com.example.buildingact.ui.theme.pages.products.ViewSpecialistScreen
import com.example.buildingact.ui.theme.pages.signup.SignupScreen
import com.example.buildingact.ui.theme.specialists.AddSpecialistScreen
import com.example.buildingact.ui.theme.specialists.UpdateSpecialistScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_LOGIN
){
    NavHost(
        navController = navController,
        modifier = Modifier,
        startDestination = startDestination){

        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }
        composable(ROUTE_SIGNUP) {
            SignupScreen(navController)
        }
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUTE_ADD_SPECIALIST) {
            AddSpecialistScreen(navController)
        }
        composable(ROUTE_VIEW_SPECIALIST){
            ViewSpecialistScreen(navController)
        }
        composable(ROUTE_UPDATE_SPECIALIST+"/{id}"){ passedData->
            UpdateSpecialistScreen(navController,passedData.arguments?.getString("id")!!)
        }

    }



}
