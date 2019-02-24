package com.orogersilva.appforusingkoin.remote

import com.orogersilva.appforusingkoin.contract.UserDataContract
import com.orogersilva.appforusingkoin.models.User

class UserRemoteDataSource : UserDataContract.Remote {

    override fun getUsers(): List<User> {

        return listOf(
            User(1L, "User 1"),
            User(2L, "User 2"),
            User(3L, "User 3")
        )
    }
}