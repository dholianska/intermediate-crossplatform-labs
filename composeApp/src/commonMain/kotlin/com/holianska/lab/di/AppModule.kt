package com.holianska.lab.di

import org.koin.dsl.module
import org.koin.plugin.module.dsl.single
import org.koin.plugin.module.dsl.viewModel
import com.holianska.lab.data.about.AboutRepository
import com.holianska.lab.data.about.Platform
import com.holianska.lab.ui.about.AboutViewModel
import org.koin.plugin.module.dsl.single

val appModule = module {
    single<com.holianska.lab.data.about.Platform>()
    single<com.holianska.lab.data.about.AboutRepository>()
    viewModel<com.holianska.lab.ui.about.AboutViewModel>()
}