package com.renderson.fitfood.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.renderson.fitfood.R
import kotlinx.android.synthetic.main.item_topic_recipe.view.*

class TopicRecipeVerticalAdapter : RecyclerView.Adapter<TopicRecipeVerticalAdapter.VerticalHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = VerticalHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_topic_recipe, parent, false)
    )

    override fun onBindViewHolder(holder: VerticalHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = 10

    class VerticalHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
            with(itemView) {
                this.rvHorizontal.layoutManager = LinearLayoutManager(
                    itemView.context, RecyclerView.HORIZONTAL, false
                )
                this.rvHorizontal.adapter = RecipeHorizontalAdapter()
            }
        }
    }
}