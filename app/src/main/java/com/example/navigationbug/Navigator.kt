package com.example.navigationbug

import androidx.navigation.NavController

object Navigator {

    var navController: NavController? = null

    fun openBaseScreen() {
        navController?.navigate(R.id.action_global_baseFragment)
    }
}