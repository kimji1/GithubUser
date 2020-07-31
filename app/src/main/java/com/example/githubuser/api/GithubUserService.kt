package com.example.githubuser.api

import com.example.githubuser.vo.User
import retrofit2.http.GET

interface GithubUserService {
    @GET("/users")
    suspend fun listUsers(): List<User>
}