package com.rommansabbir.repositoryfactoryandroidexample.features.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rommansabbir.repositoryfactoryandroidexample.data.repo.post.PostRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(private val postRepository: PostRepository) :
    ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text

    fun doDummyWork() {
        viewModelScope.launch {
            _text.value = "Doing some stuff on repository layer"
            delay(3000)
            postRepository.createNewPost()
            _text.value = "Method called createNewPost()"
            delay(3000)
            postRepository.updatePost()
            _text.value = "Method called updatePost()"
            delay(3000)
            postRepository.deletePost()
            _text.value = "Method called deletePost()"
            delay(3000)
            _text.value = "Completed"
        }
    }
}