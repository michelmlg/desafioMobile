package com.example.desafiomobile.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil3.*
import com.example.desafiomobile.R
import com.example.desafiomobile.model.Item


class ItemAdapter(private val items:List<Item>):
    RecyclerView.Adapter<ItemAdapter.ViewHolder>(){
        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            val edtName: TextView = itemView.findViewById(R.id.tx_name)
            val edtValue: TextView = itemView.findViewById(R.id.tx_value)
            val imgImage: ImageView = itemView.findViewById(R.id.img_link)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_collectable, parent, false)
            return ViewHolder(view)
        }

        override fun getItemCount(): Int {
            return items.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = items[position]
            holder.edtName.text = item.name
            holder.edtValue.text = item.value.toString()

            holder.imgImage.load(item.imgLink)



        }
}