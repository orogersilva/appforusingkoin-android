package com.orogersilva.appforusingkoin.di

import com.orogersilva.appforusingkoin.contract.UserDataContract
import com.orogersilva.appforusingkoin.contract.repositories.UserRepository
import com.orogersilva.appforusingkoin.remote.UserRemoteDataSource
import com.orogersilva.appforusingkoin.repositories.UserDataRepository
import com.orogersilva.appforusingkoin.viewmodels.MainViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

val mainViewModelModule: Module = module {

    viewModel { MainViewModel(userRepository = get()) }
}

val userNetworkModule: Module = module {

    factory<UserDataContract.Remote> { UserRemoteDataSource() }
}

val userRepositoryModule: Module = module(override = true) {

    factory<UserRepository> { UserDataRepository(userRemoteDataSource = get()) }
}