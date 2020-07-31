package com.example.githubuser.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.githubuser.repository.UserRepository
import kotlinx.coroutines.Dispatchers

class MainViewModel @ViewModelInject constructor(var repository: UserRepository) : ViewModel() {
    fun fetchUsers() = liveData(Dispatchers.IO) {
        val users = repository.loadUsers()
        emit(users)
    }
}