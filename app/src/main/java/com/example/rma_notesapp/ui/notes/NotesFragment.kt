package com.example.rma_notesapp.ui.notes

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
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NotesFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_notes, container, false)

        val button = root.findViewById<FloatingActionButton>(R.id.btnAddNote)
        button.setOnClickListener(this::createNewNote)

        return root
    }

    fun createNewNote(view: View){
        val intent = Intent(activity, NotesActivity::class.java)
        startActivity(intent)
    }
}