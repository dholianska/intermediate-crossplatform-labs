package com.holianska.lab.di

import com.russhwolf.settings.ObservableSettings
import com.russhwolf.settings.Settings
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module
import org.koin.plugin.module.dsl.create
import org.koin.plugin.module.dsl.single
import org.koin.plugin.module.dsl.viewModel
import com.holianska.lab.data.about.AboutRepository
import com.holianska.lab.data.about.Platform
import com.holianska.lab.data.common.preferences.AppPreferences
import com.holianska.lab.data.common.preferences.Preferences
import com.holianska.lab.ui.about.AboutViewModel
import org.koin.plugin.module.dsl.single
import org.koin.core.scope.Scope
import com.holianska.lab.data.reminders.RemindersRepository
import com.holianska.lab.ui.reminders.ReminderViewModel


private fun createSettings() : Settings = Settings()

val dataModule = module {
    single { create(::createSettings) } binds arrayOf(Settings::class, ObservableSettings::class)
    singleOf(::AppPreferences) bind Preferences::class

}

val appModule = module {
    includes(dataModule)
    single<Platform>()
    single<AboutRepository>()
    viewModel<AboutViewModel>()
    single<RemindersRepository>()
    viewModel<ReminderViewModel>()
}