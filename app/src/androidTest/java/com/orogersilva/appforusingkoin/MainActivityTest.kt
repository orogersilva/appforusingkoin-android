package com.orogersilva.appforusingkoin

import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.orogersilva.appforusingkoin.di.userRepositoryModule
import com.orogersilva.appforusingkoin.view.MainActivity
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.koin.standalone.StandAloneContext.loadKoinModules
import org.koin.test.KoinTest

@RunWith(AndroidJUnit4::class)
class MainActivityTest : KoinTest {

    @get:Rule
    var activityTestRule: ActivityTestRule<MainActivity> =
        ActivityTestRule(MainActivity::class.java)

    @Before fun setUp() {

        loadKoinModules(userRepositoryModule)
    }

    @Test fun testing() {

        // ARRANGE

        // ACT

        // ASSERT

        assertEquals(8, 4 + 4)
    }
}