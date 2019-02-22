package com.orogersilva.appforusingkoin.viewmodels

import androidx.lifecycle.ViewModel
import com.orogersilva.appforusingkoin.contract.repositories.UserRepository

class MainViewModel(private val userRepository: UserRepository) : ViewModel() {

    fun loadUsers() {

        val users = userRepository.getUsers()
    }
}