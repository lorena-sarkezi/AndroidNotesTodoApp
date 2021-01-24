package com.example.rma_notesapp.ui.todos

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.rma_notesapp.R
import com.example.rma_notesapp.ui.notes.NotesActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TodosFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_todos, container, false)

        val button = root.findViewById<FloatingActionButton>(R.id.btnAddTodo)
        button.setOnClickListener(this::createNewTodo)

        return root
    }

    fun createNewTodo(view: View){
        val intent = Intent(activity, TodosActivity::class.java)
        startActivity(intent)
    }
}