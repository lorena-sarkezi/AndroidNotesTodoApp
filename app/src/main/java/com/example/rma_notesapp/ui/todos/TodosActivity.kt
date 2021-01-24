package com.example.rma_notesapp.ui.todos

import android.app.Activity
import android.app.AppComponentFactory
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.rma_notesapp.R
import com.example.rma_notesapp.ui.notes.NotesActivity

class TodosActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todos)
    }


}