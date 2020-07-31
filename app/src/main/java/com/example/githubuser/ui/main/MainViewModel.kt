package com.example.githubuser.ui.main

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.githubuser.vo.UserRepository
import kotlinx.coroutines.Dispatchers

class MainViewModel @ViewModelInject constructor(
    private val repository: UserRepository,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    fun fetchUsers() = liveData(Dispatchers.IO) {
        val users = repository.loadUsers()
        emit(users)
    }
}