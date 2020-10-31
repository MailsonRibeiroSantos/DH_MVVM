package com.mailsonribeiro.dh_mvvm.todolist.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mailsonribeiro.dh_mvvm.R

class MainActivity : AppCompatActivity() {
    val toDoFragment = ToDoFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager

        val transaction = manager.beginTransaction()
        transaction.add(R.id.container, toDoFragment)
        transaction.commit()
    }
}