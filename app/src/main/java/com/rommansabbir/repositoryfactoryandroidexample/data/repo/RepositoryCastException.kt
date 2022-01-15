package com.rommansabbir.repositoryfactoryandroidexample.data.repo

class RepositoryCastException(clazz: String) :
    RuntimeException("Failed to Repository object to $clazz")