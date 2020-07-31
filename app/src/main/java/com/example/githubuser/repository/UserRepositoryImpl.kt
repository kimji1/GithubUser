package com.example.githubuser.repository

import com.example.githubuser.api.GithubUserService
import com.example.githubuser.vo.User
import com.example.githubuser.vo.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(val service: GithubUserService) : UserRepository {
    override suspend fun loadUsers(): List<User> = service.listUsers()
}