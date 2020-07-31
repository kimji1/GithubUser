package com.example.githubuser.vo

interface UserRepository {
    suspend fun loadUsers() : List<User>
}