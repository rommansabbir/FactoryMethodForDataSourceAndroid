package com.rommansabbir.repositoryfactoryandroidexample.base.factory

import com.rommansabbir.repositoryfactoryandroidexample.data.repo.Repository
import com.rommansabbir.repositoryfactoryandroidexample.data.repo.RepositoryType

/**
 * Entry point for the client to access all repository.
 * Limit the access for [Repository] type by following [RepositoryType].
 */
class RepositoryFactory : BaseRepositoryFactory() {
    override fun <T : Repository> getRepository(type: RepositoryType): T = provideRepository(type)
}