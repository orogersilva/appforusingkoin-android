package com.orogersilva.appforusingkoin.di

import com.orogersilva.appforusingkoin.viewmodels.MainViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

val mainViewModelModule: Module = module {

    viewModel { MainViewModel(userRepository = get()) }
}