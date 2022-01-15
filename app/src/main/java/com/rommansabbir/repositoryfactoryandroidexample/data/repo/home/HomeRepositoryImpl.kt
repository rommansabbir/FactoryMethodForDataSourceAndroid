package com.rommansabbir.repositoryfactoryandroidexample.data.repo.home

import com.rommansabbir.repositoryfactoryandroidexample.data.repo.home.HomeRepository

internal class HomeRepositoryImpl : HomeRepository {
    override fun getLatestPost() {
        println("getLatestPost()")
    }

    override fun search() {
        println("search")
    }

}