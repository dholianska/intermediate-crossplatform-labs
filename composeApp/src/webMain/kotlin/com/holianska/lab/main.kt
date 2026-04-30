package com.holianska.lab

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.holianska.lab.ui.root.AppScaffold

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport {
        AppScaffold()
    }
}