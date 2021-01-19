package com.example.rma_notesapp.ui.todos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ovdje idu TODO Liste"
    }
    val text: LiveData<String> = _text
}