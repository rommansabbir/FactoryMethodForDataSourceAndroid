package com.rommansabbir.repositoryfactoryandroidexample.data.repo.user

internal class UserRepositoryImpl : UserRepository {
    override fun getUserProfile() {
        println("getUserProfile()")
    }

    override fun getUserAllPost() {
        println("getUserAllPost()")
    }

}