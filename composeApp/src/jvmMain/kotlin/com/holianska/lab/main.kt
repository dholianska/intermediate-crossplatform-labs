package com.holianska.lab

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.holianska.lab.di.initKoin
import com.holianska.lab.ui.root.AppScaffold

fun main() = application {
    initKoin { printLogger() }
    Window(
        onCloseRequest = ::exitApplication,
        title = "Organise",
    ) {
        AppScaffold()
    }
}