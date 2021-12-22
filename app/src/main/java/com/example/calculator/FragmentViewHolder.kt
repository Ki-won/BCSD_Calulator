package com.example.calculator

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

    class FragmentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var listText: TextView = itemView.findViewById(R.id.list_text_view)
        val listImage: ImageView = itemView.findViewById(R.id.list_image_view)
    }
