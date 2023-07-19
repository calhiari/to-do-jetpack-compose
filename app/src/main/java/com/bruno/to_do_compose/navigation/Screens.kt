package com.bruno.to_do_compose.navigation

import androidx.navigation.NavHostController
import com.bruno.to_do_compose.util.Action

class Screens (navController: NavHostController){
    val list: (Action) -> Unit = {action ->
        navController.navigate("list/${action.name}")
    }
}