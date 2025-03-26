package com.example.desafiomobile.dao

import com.example.desafiomobile.model.Item

class ItemDaoImplements:ItemDao{
    companion object{
        private val items = mutableListOf<Item>()
    }

    override fun addItem(item: Item) {
        items.add(item)
    }

    override fun getItem(): List<Item> {
        return items
    }
}