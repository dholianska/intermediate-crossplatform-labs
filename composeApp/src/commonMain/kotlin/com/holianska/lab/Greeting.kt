package com.holianska.lab

import com.holianska.lab.data.about.Platform

class Greeting {
    private val platform = Platform()

    fun greet(): String {
        return "Hello, ${platform.osName}!"
    }
}