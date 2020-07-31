package com.example.githubuser.di

import com.example.githubuser.api.GithubUserService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit

@Module
@InstallIn(ApplicationComponent::class)
class NetworkModule {
    @Provides
    fun provideGithubUserService(): GithubUserService {
        return Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .build()
            .create(GithubUserService::class.java)
    }
}