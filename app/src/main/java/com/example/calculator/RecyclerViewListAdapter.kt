package com.example.calculator

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewListAdapter : RecyclerView.Adapter<RecyclerViewListViewHolder>() {

    private val itemList = mutableListOf<RecyclerViewListViewHolder>()


    private var itemClickListener: RecyclerViewItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewListViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_main, parent, false)
        return RecyclerViewListViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewListViewHolder, position: Int) {
        holder.listText.text = itemList.toString()

        holder.listContainer.setOnClickListener {
            itemClickListener?.onRecyclerViewItemClicked(
                holder.listContainer,
                holder.adapterPosition
            )
        }
        holder.listContainer.setOnLongClickListener {
            itemClickListener?.onRecyclerViewItemLongClicked(
                holder.listContainer,
                holder.adapterPosition
            )
            true
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    fun setRecyclerViewClickListener(itemClickListener: RecyclerViewItemClickListener) {
        this.itemClickListener = itemClickListener
    }

    fun deleteListItem(position: Int) {
        itemList.removeAt(position)
        notifyDataSetChanged()
    }

    fun addData(position: Int){


    }

}





