package com.orogersilva.appforusingkoin.repositories

import com.orogersilva.appforusingkoin.contract.UserDataContract
import com.orogersilva.appforusingkoin.contract.repositories.UserRepository
import com.orogersilva.appforusingkoin.models.User

class UserDataRepository(private val userRemoteDataSource: UserDataContract.Remote) : UserRepository {

    override fun getUsers(): List<User> = userRemoteDataSource.getUsers()
}