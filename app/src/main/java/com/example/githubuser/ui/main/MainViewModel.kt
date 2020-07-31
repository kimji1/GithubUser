package com.example.githubuser.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.githubuser.vo.User
import com.example.githubuser.vo.UserRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel : ViewModel() {
    @Inject
    lateinit var repository: UserRepository

    val usersLiveData = MutableLiveData<List<User>>()

    public fun fetchUsers() {
        viewModelScope.launch {
            usersLiveData.postValue(repository.loadUsers())
        }
    }
}