package com.rommansabbir.repositoryfactoryandroidexample.data.repo.post

internal class PostRepositoryImpl : PostRepository {
    override fun createNewPost() {
        println("createNewPost()")
    }

    override fun updatePost() {
        println("updatePost()")
    }

    override fun deletePost() {
        println("deletePost()")
    }

}