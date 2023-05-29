package com.example.data.repositories

import com.example.data.local.preferences.UserDataPreferencesHelper
import com.example.domain.models.User
import com.example.domain.repositories.UserDataRepository
import javax.inject.Inject

class UserDataRepositoryImpl @Inject constructor(
    private val userDataPreferencesHelper: UserDataPreferencesHelper
) : UserDataRepository {

    override fun authUser(name: String, surname: String, age: Int) {
        userDataPreferencesHelper.name = name
        userDataPreferencesHelper.surname = surname
        userDataPreferencesHelper.age = age
    }

    override fun getUser() = User(
        userDataPreferencesHelper.name.toString(),
        userDataPreferencesHelper.surname.toString(),
        userDataPreferencesHelper.age
    )
}