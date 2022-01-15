package com.rommansabbir.repositoryfactoryandroidexample.data.repo.message

import com.rommansabbir.repositoryfactoryandroidexample.data.repo.Repository

interface MessageRepository : Repository {
    fun sendMessage()
    fun getMessages()
    fun getDetailMessages()
}

