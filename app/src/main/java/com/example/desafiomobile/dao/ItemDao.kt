package com.example.desafiomobile.dao

import com.example.desafiomobile.model.Item

// teste
interface ItemDao {
    fun addItem(item: Item)
    fun getItem(): List<Item>
}