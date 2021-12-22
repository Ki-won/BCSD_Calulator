package com.example.calculator

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FragmentAdapter {
}
class LyeAdapter : RecyclerView.Adapter<FragmentViewHolder>() {

    val list = (1..100).toList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FragmentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_main, parent, false)
        return FragmentViewHolder(view)
    }

    override fun onBindViewHolder(holder: FragmentViewHolder, position: Int) {
        holder.listText.text = list[position].toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }
}