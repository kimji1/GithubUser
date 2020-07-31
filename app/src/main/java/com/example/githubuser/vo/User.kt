package com.example.githubuser.vo

data class User(
    val url: String,
    val avatar_url: String,
    val gists_url: String,
    val public_gists: Int,
    val repos_url: String,
    val public_repos: Int,
    val location: String,
    val email: String
)