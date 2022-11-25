package com.international.data.di

import com.international.data.repository.ArticalsRepositoryImpl
import com.international.domain.repository.ArticalRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun provideArticalRepository(articalsRepositoryImpl: ArticalsRepositoryImpl): ArticalRepository



}