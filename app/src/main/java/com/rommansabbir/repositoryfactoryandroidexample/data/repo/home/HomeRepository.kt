package com.rommansabbir.repositoryfactoryandroidexample.data.repo.home

import com.rommansabbir.repositoryfactoryandroidexample.data.repo.Repository

interface HomeRepository : Repository {
    fun getLatestPost()
    fun search()
}

