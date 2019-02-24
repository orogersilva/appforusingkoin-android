package com.orogersilva.appforusingkoin.contract

import com.orogersilva.appforusingkoin.models.User

interface UserDataContract {

    interface Remote {

        fun getUsers(): List<User>
    }
}