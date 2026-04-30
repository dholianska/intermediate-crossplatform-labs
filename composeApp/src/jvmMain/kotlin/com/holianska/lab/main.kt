package com.holianska.lab

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.holianska.lab.ui.root.AppScaffold

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Organise",
    ) {
        AppScaffold()
    }
}