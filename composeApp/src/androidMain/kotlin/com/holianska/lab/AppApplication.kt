package com.holianska.lab

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import com.holianska.lab.di.initKoin

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        com.holianska.lab.di.initKoin {
            androidContext(this@AppApplication)
            androidLogger()
        }
    }
}