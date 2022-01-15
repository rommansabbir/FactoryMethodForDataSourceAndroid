package com.rommansabbir.repositoryfactoryandroidexample.base.di

import com.rommansabbir.repositoryfactoryandroidexample.base.factory.RepositoryFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object SingletonModule {

    /**
     * Provides [RepositoryFactory] instance to the requested dependent.
     */
    @Provides
    fun provideRepositoryFactory(): RepositoryFactory = RepositoryFactory()
}