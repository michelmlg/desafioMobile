package com.example.desafiomobile

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiomobile.adapter.ItemAdapter
import com.example.desafiomobile.dao.ItemDaoImplements

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list)

        val dao = ItemDaoImplements()

        Log.i("listUser", dao.getItem().toString())

        val rvItems = findViewById<RecyclerView>(R.id.rv_items)
        val items = dao.getItem()

        rvItems.layoutManager = LinearLayoutManager(this)
        rvItems.adapter = ItemAdapter(items)
    }
}