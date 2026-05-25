package com.holianska.lab.data.common.preferences

import kotlinx.serialization.Serializable

@Serializable
data class LastTimeScreenOpened(
    val year: Int,
    val month: Int,
    val day: Int,
    val hours: Int,
    val minutes: Int
)