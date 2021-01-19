package com.example.rma_notesapp.ui.todos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.rma_notesapp.R

class TodosFragment : Fragment() {

    private lateinit var todosViewModel: TodosViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        todosViewModel =
                ViewModelProvider(this).get(TodosViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_todos, container, false)
        val textView: TextView = root.findViewById(R.id.text_todos)
        todosViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}