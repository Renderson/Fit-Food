package com.renderson.fitfood.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.renderson.fitfood.R
import com.renderson.fitfood.model.Category
import com.renderson.fitfood.model.Games
import kotlinx.android.synthetic.main.item_recipe.view.*

class RecipeHorizontalAdapter(
    private val games: List<Games>
) : RecyclerView.Adapter<RecipeHorizontalAdapter.HorizontalHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = HorizontalHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_recipe, parent, false)
    )

    override fun onBindViewHolder(holder: HorizontalHolder, position: Int) {
        holder.bind(games[position])
    }

    override fun getItemCount(): Int = games.size

    class HorizontalHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(games: Games) {
            with(itemView) {
                itemTitle.text = games.title
                itemSubTitle.text = games.subtitle

                Glide.with(itemIcon.context)
                    .load(games.icon)
                    .centerCrop()
                    .into(itemIcon)

                this.setOnClickListener {
                    Toast.makeText(itemView.context, games.title, Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}