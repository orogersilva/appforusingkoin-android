package com.orogersilva.appforusingkoin.contract.repositories

import com.orogersilva.appforusingkoin.models.User

interface UserRepository {

    fun getUsers(): List<User>
}