package com.renderson.fitfood.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.renderson.fitfood.R
import com.renderson.fitfood.model.Data
import com.renderson.fitfood.model.feed
import com.renderson.fitfood.view.adapter.TopicRecipeVerticalAdapter

class RecipeFragment : Fragment() {

    private var recipeVerticalAdapter: TopicRecipeVerticalAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recipe, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recipeVerticalAdapter = TopicRecipeVerticalAdapter()
        view.findViewById<RecyclerView>(R.id.rvVertical).adapter = recipeVerticalAdapter
        requestJson()
    }

    private fun requestJson() {
        Thread {
            Thread.sleep(1000)
            val feed = Gson().fromJson(feed(), Data::class.java)

            activity?.runOnUiThread {
                recipeVerticalAdapter?.add(feed.category)
            }
        }.start()
    }
}