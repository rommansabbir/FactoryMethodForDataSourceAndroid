package com.rommansabbir.repositoryfactoryandroidexample.data.repo

/**
 * Limit the access to the client by providing the selective type to request [Repository] from the factory.
 */
sealed class RepositoryType {
    object POST : RepositoryType()
    object USER : RepositoryType()
    object HOME : RepositoryType()
    object MESSAGES : RepositoryType()
}
