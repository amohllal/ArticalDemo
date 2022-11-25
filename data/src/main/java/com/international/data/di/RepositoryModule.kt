package com.international.data.di

import com.international.data.repository.ArticleRepositoryImpl
import com.international.domain.repository.ArticleRepository
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
    abstract fun provideArticleRepository(articleRepositoryImpl: ArticleRepositoryImpl): ArticleRepository



}