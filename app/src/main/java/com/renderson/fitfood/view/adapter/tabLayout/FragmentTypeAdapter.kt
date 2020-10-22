package com.renderson.fitfood.view.adapter.tabLayout

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.renderson.fitfood.model.RecipeType
import com.renderson.fitfood.view.RecipeFragment

class FragmentTypeAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount() = RecipeType.values().size

    override fun createFragment(position: Int): Fragment {
        return RecipeFragment()
    }
}