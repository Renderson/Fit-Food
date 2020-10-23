package com.renderson.fitfood.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.renderson.fitfood.R
import com.renderson.fitfood.model.Category
import kotlinx.android.synthetic.main.item_topic_recipe.view.*

class TopicRecipeVerticalAdapter(
    private val category: MutableList<Category> = mutableListOf()
) : RecyclerView.Adapter<TopicRecipeVerticalAdapter.VerticalHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = VerticalHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_topic_recipe, parent, false)
    )

    override fun onBindViewHolder(holder: VerticalHolder, position: Int) {
        holder.bind(category[position])
    }

    fun add(category: List<Category>) {
        this.category.clear()
        this.category.addAll(category)
        this.notifyDataSetChanged()
    }

    override fun getItemCount(): Int = category.size

    class VerticalHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(category: Category) {
            with(itemView) {
                this.txtTitle.text = category.title
                this.txtSubTitle.text = category.title

                this.rvHorizontal.layoutManager = LinearLayoutManager(
                    itemView.context, RecyclerView.HORIZONTAL, false
                )
                this.rvHorizontal.adapter = RecipeHorizontalAdapter(category.games)
            }
        }
    }
}