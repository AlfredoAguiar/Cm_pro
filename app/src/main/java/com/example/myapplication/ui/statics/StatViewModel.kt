package com.example.myapplication.ui.test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StatViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is StatFragment not sure what to put"
    }
    val text: LiveData<String> = _text
}