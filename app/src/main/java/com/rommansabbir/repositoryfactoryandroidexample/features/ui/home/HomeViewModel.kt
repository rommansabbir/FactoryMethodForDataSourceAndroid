package com.rommansabbir.repositoryfactoryandroidexample.features.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rommansabbir.repositoryfactoryandroidexample.data.repo.home.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val homeRepository: HomeRepository) :
    ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text


    fun doDummyWork() {
        viewModelScope.launch {
            _text.value = "Doing some stuff on repository layer"
            delay(3000)
            homeRepository.getLatestPost()
            _text.value = "Method called getLatestPost()"
            delay(3000)
            homeRepository.search()
            _text.value = "Method called search()"
            delay(3000)
            _text.value = "Completed"
        }
    }
}