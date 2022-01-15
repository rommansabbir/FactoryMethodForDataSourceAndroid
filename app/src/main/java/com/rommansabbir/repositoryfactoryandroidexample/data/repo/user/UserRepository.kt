package com.rommansabbir.repositoryfactoryandroidexample.data.repo.user

import com.rommansabbir.repositoryfactoryandroidexample.data.repo.Repository

interface UserRepository : Repository {
    fun getUserProfile()
    fun getUserAllPost()
}

