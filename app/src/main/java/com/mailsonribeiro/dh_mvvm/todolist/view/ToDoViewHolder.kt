package com.mailsonribeiro.dh_mvvm.todolist.view

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.checkbox.MaterialCheckBox
import com.mailsonribeiro.dh_mvvm.R
import com.mailsonribeiro.dh_mvvm.todolist.model.Tarefa
import kotlinx.android.synthetic.main.item_tarefa.view.*

class ToDoViewHolder(private val view: View): RecyclerView.ViewHolder(view){

    private val txtNomeTarefa = view.findViewById<TextView>(R.id.txtNomeTarefa_itemTarefa)
    fun bind(tarefa: Tarefa){
        txtNomeTarefa.text = tarefa.nome
    }
}