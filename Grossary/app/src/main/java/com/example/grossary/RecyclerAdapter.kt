package com.example.grossary

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val context: Context, val grossary: List<Item> ): RecyclerView.Adapter<RecyclerAdapter.GrossaryHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.GrossaryHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false)

        return GrossaryHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.GrossaryHolder, position: Int) {
        // Binding the data
        val item = grossary[position]
        holder.setData(item,position)
    }

    override fun getItemCount() = grossary.size


    // Class for keeping hold of my views
    inner class GrossaryHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var item_names: Item? = null
        var itemPosition: Int = 0
        val item_list = itemView.findViewById<TextView>(R.id.display_item)

        // Setting an onClickListener to the view of the recyclerView
        init {
            itemView.setOnClickListener {
                // Explicit intent
                val intent = Intent(context, GrossaryInfoActivity::class.java)
                intent.putExtra("Item_information",item_names!!.itemName + " "+ itemPosition.toString())

                startActivity(context,intent,null)
            }
        }

        // This is the method that sets the data to the recyclerView
        fun setData(item1: Item?, pos: Int){
            item_list.text = item1!!.itemName

            this.item_names = item1
            this.itemPosition = pos
        }
    }
}