package com.rommansabbir.repositoryfactoryandroidexample.data.repo.post

import com.rommansabbir.repositoryfactoryandroidexample.data.repo.Repository

interface PostRepository : Repository {
    fun createNewPost()
    fun updatePost()
    fun deletePost()
}

