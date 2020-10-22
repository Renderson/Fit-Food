package com.renderson.fitfood.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.renderson.fitfood.R

class RecipeHorizontalAdapter : RecyclerView.Adapter<RecipeHorizontalAdapter.HorizontalHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = HorizontalHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_recipe, parent, false)
    )

    override fun onBindViewHolder(holder: HorizontalHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = 10

    class HorizontalHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
        }

    }
}