package com.mailsonribeiro.dh_mvvm.todolist.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mailsonribeiro.dh_mvvm.R
import com.mailsonribeiro.dh_mvvm.todolist.model.Tarefa

class ToDoAdapter(private val dataSet: List<Tarefa>): RecyclerView.Adapter<ToDoViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tarefa, parent, false)

        return ToDoViewHolder(view)
    }

    override fun getItemCount() = dataSet.size

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }
}