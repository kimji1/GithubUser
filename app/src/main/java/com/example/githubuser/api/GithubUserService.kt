package com.example.githubuser.api

import com.example.githubuser.vo.User
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubUserService {
    @GET("/users")
    suspend fun listUsers(@Query("since") lastUserId: String? = null): List<User>
}