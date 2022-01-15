package com.rommansabbir.repositoryfactoryandroidexample.features.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rommansabbir.repositoryfactoryandroidexample.data.repo.user.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NotificationsViewModel @Inject constructor(private val userRepository: UserRepository) :
    ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    val text: LiveData<String> = _text

    fun doDummyWork() {
        viewModelScope.launch {
            _text.value = "Doing some stuff on repository layer"
            delay(3000)
            userRepository.getUserAllPost()
            _text.value = "Method called getUserAllPost()"
            delay(3000)
            userRepository.getUserProfile()
            _text.value = "Method called getUserProfile()"
            delay(3000)
            _text.value = "Completed"
        }
    }
}