package com.orogersilva.appforusingkoin.di

import com.orogersilva.appforusingkoin.contract.UserDataContract
import com.orogersilva.appforusingkoin.contract.repositories.UserRepository
import com.orogersilva.appforusingkoin.remote.UserRemoteDataSource
import com.orogersilva.appforusingkoin.repositories.UserDataRepository
import org.koin.dsl.module.Module
import org.koin.dsl.module.module

val userNetworkModule: Module = module {

    factory<UserDataContract.Remote> { UserRemoteDataSource() }
}

val userRepositoryModule: Module = module(override = true) {

    factory<UserRepository> { UserDataRepository(userRemoteDataSource = get()) }
}