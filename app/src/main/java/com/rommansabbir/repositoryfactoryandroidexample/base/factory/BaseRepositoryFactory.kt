package com.rommansabbir.repositoryfactoryandroidexample.base.factory

import com.rommansabbir.repositoryfactoryandroidexample.data.repo.Repository
import com.rommansabbir.repositoryfactoryandroidexample.data.repo.RepositoryCastException
import com.rommansabbir.repositoryfactoryandroidexample.data.repo.RepositoryType
import com.rommansabbir.repositoryfactoryandroidexample.data.repo.home.HomeRepositoryImpl
import com.rommansabbir.repositoryfactoryandroidexample.data.repo.message.MessageRepositoryImpl
import com.rommansabbir.repositoryfactoryandroidexample.data.repo.post.PostRepositoryImpl
import com.rommansabbir.repositoryfactoryandroidexample.data.repo.user.UserRepositoryImpl

abstract class BaseRepositoryFactory {
    /**
     * Return the requested [Repository] to the client.
     * Client should provide the [javaObjectType] and factory provide the requested [Repository] object.
     *
     * @param type, object type that is requested by the client.
     *
     * @return [T], Requested object type [T].
     */
    @Throws(RepositoryCastException::class)
    abstract fun <T : Repository> getRepository(type: RepositoryType): T

    /**
     * Cast parent [Repository] to child class [T]
     *
     * @param repository, repository that will be casted into [T]
     * @return [T], Required object type [T]
     *
     * @throws [RepositoryCastException], if unable to cast [Repository] to targeted object.
     */
    @Throws(RepositoryCastException::class)
    protected fun <T : Repository> getAs(repository: Repository): T {
        try {
            return repository as T
        } catch (e: Exception) {
            e.printStackTrace()
            throw RepositoryCastException("")
        }
    }

    /**
     * Implementation to get requested repository.
     *
     * @param type, object type that is requested by the client.
     *
     * @return [T], Requested object type [T].
     */
    protected fun <T : Repository> provideRepository(type: RepositoryType): T {
        return when (type) {
            RepositoryType.USER -> getAs(UserRepositoryImpl())
            RepositoryType.POST -> getAs(PostRepositoryImpl())
            RepositoryType.MESSAGES -> getAs(MessageRepositoryImpl())
            RepositoryType.HOME -> getAs(HomeRepositoryImpl())
        }
    }
}

