package com.example.todoapp

import Item
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.databinding.ActivityMainBinding

class ItemAdapter(private val items:List<Item>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    inner class ItemViewHolder(view: View):RecyclerView.ViewHolder(view){
        val itemImage: ImageView = view.findViewById<ImageView>(R.id.imageView)
        val itemTitle: TextView = view.findViewById<TextView>(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
return ItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val currentItem = items[position]
        holder.itemImage.setImageResource(currentItem.image)
        holder.itemTitle.text = currentItem.title
    }

    override fun getItemCount(): Int  = items.size
}