package com.example.desafiomobile.dao

import com.example.desafiomobile.model.Item


interface ItemDao {
    fun addItem(item: Item)
    fun getItem(): List<Item>
}