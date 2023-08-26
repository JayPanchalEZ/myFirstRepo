package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val itemList: List<String>) :
        RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){
            class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
                val itemText: TextView = itemView.findViewById(R.id.itemText)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.itemText.text = currentItem
    }

    override fun getItemCount() = itemList.size

        }