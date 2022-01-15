package com.rommansabbir.repositoryfactoryandroidexample.base.di

import com.rommansabbir.repositoryfactoryandroidexample.base.factory.RepositoryFactory
import com.rommansabbir.repositoryfactoryandroidexample.data.repo.RepositoryType
import com.rommansabbir.repositoryfactoryandroidexample.data.repo.home.HomeRepository
import com.rommansabbir.repositoryfactoryandroidexample.data.repo.message.MessageRepository
import com.rommansabbir.repositoryfactoryandroidexample.data.repo.post.PostRepository
import com.rommansabbir.repositoryfactoryandroidexample.data.repo.user.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

/**
 * From this entry point, we will use the [RepositoryFactory] to instantiate [Repository] objects.
 */

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {
    /**
     * Provide [HomeRepository] to the dependent.
     * Required object [factory] will be provided by Hilt.\
     *
     * @param factory, [RepositoryFactory] instance to provide the dependency.
     */
    @Provides
    fun getHomeRepository(factory: RepositoryFactory): HomeRepository =
        factory.getRepository(RepositoryType.HOME)

    /**
     * Provide [MessageRepository] to the dependent.
     * Required object [factory] will be provided by Hilt.
     *
     * @param factory, [RepositoryFactory] instance to provide the dependency.
     */
    @Provides
    fun getMessageRepository(factory: RepositoryFactory): MessageRepository =
        factory.getRepository(RepositoryType.MESSAGES)

    /**
     * Provide [UserRepository] to the dependent.
     * Required object [factory] will be provided by Hilt.
     *
     * @param factory, [RepositoryFactory] instance to provide the dependency.
     */
    @Provides
    fun getUserRepository(factory: RepositoryFactory): UserRepository =
        factory.getRepository(RepositoryType.USER)

    /**
     * Provide [PostRepository] to the dependent.
     * Required object [factory] will be provided by Hilt.
     *
     * @param factory, [RepositoryFactory] instance to provide the dependency.
     */
    @Provides
    fun getPostRepository(factory: RepositoryFactory): PostRepository =
        factory.getRepository(RepositoryType.POST)
}