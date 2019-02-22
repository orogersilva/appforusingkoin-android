package com.orogersilva.appforusingkoin

import android.app.Application
import com.orogersilva.appforusingkoin.di.mainViewModelModule
import com.orogersilva.appforusingkoin.di.userNetworkModule
import com.orogersilva.appforusingkoin.di.userRepositoryModule
import org.koin.android.ext.android.startKoin

class AppForUsingKoinApplication : Application() {

    override fun onCreate() {

        super.onCreate()

        // Initizializing Koin...
        startKoin(this@AppForUsingKoinApplication, listOf(
            mainViewModelModule,
            userNetworkModule,
            userRepositoryModule
        ))
    }
}