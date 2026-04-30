package com.holianska.lab

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform