package com.example.rma_notesapp.ui.notes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ovdje idu bilješke"
    }
    val text: LiveData<String> = _text
}