package com.holianska.lab.ui.root

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.holianska.lab.ui.about.AboutScreen
import com.holianska.lab.ui.reminders.RemindersPage

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = _root_ide_package_.com.holianska.lab.ui.root.Screen.Reminders.route,
        modifier = modifier,
    ) {
        composable(_root_ide_package_.com.holianska.lab.ui.root.Screen.Reminders.route) {
            _root_ide_package_.com.holianska.lab.ui.reminders.RemindersPage(
                onAboutButtonClick = { navController.navigate(_root_ide_package_.com.holianska.lab.ui.root.Screen.AboutDevice.route) }
            )
        }

        composable(_root_ide_package_.com.holianska.lab.ui.root.Screen.AboutDevice.route) {
            _root_ide_package_.com.holianska.lab.ui.about.AboutScreen(
                onUpButtonClick = { navController.popBackStack() }
            )
        }
    }
}