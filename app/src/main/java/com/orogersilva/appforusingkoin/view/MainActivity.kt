package com.orogersilva.appforusingkoin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.orogersilva.appforusingkoin.R
import com.orogersilva.appforusingkoin.databinding.ActivityMainBinding
import com.orogersilva.appforusingkoin.viewmodels.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel by viewModel<MainViewModel>()

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        activityMainBinding.mainViewModel = mainViewModel
    }

    override fun onResume() {

        super.onResume()

        mainViewModel.loadUsers()
    }
}
