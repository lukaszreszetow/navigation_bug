package com.example.navigationbug

import androidx.navigation.NavController
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_base_screen.*

object Navigator {

    var navController: NavController? = null

    fun openBaseScreen() {
        navController?.navigate(R.id.action_global_baseFragment)
    }
}