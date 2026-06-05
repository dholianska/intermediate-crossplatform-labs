package com.holianska.lab.data.common.db

import kotlinx.coroutines.flow.Flow
import com.holianska.lab.Task

interface LocalDataSource {

    fun insertTask(description: String)

    fun getAllTasks(): List<Task>

    fun markTaskCompleted(id: Long)

    fun markTaskPending(id: Long)

    fun deleteTask(id: Long)
}