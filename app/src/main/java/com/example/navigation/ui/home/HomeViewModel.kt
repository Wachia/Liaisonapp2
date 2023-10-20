package com.example.navigation.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.nio.file.Paths.get

class HomeViewModel : ViewModel() {

    private val _name = MutableLiveData<String>().apply {
        val name: LiveData<String>
        get() = _name

        fun nameTag(Name: String){
            if (Name == null){
                _name.value =
            }
        }
    }
    val text: LiveData<String> = _name
}