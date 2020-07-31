package com.example.githubuser.di

import com.example.githubuser.repository.UserRepositoryImpl
import com.example.githubuser.vo.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindUserRepositoryService(userRepositoryImpl: UserRepositoryImpl): UserRepository
}