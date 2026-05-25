package com.holianska.lab

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.holianska.lab.ui.root.AppScaffold

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    _root_ide_package_.com.holianska.lab.di.initKoin { printLogger() }
    ComposeViewport {
        AppScaffold()
    }
}