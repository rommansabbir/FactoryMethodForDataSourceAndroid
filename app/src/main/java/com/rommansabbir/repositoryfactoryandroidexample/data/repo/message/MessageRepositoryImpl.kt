package com.rommansabbir.repositoryfactoryandroidexample.data.repo.message

import com.rommansabbir.repositoryfactoryandroidexample.data.repo.message.MessageRepository

internal class MessageRepositoryImpl : MessageRepository {
    override fun sendMessage() {
        println("sendMessage()")
    }

    override fun getMessages() {
        println("getMessages()")
    }

    override fun getDetailMessages() {
        println("getDetailMessages()")
    }

}