package com.example.rma_notesapp.ui.archive

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ArchiveViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ovdje idu arhivirane bilješke (pod lozinkom)"
    }
    val text: LiveData<String> = _text
}