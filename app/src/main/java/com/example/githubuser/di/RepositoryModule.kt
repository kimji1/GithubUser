package com.example.githubuser.di

import com.example.githubuser.api.GithubUserService
import com.example.githubuser.repository.UserRepositoryImpl
import com.example.githubuser.vo.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class RepositoryModule {
    @Provides
    fun provideUserRepositoryService(service: GithubUserService): UserRepository =
        UserRepositoryImpl(service)
}