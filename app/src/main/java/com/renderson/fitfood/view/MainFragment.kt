package com.renderson.fitfood.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.renderson.fitfood.R
import com.renderson.fitfood.model.RecipeType
import kotlinx.android.synthetic.main.fragment_main.view.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.fragViewPager.adapter = FragmentTypeAdapter(this)
        view.fragViewPager.isUserInputEnabled = false

        TabLayoutMediator(view.tabLayout, view.fragViewPager) { tab, position ->
            tab.text = RecipeType.values()[position].label
        }.attach()
    }
}

class FragmentTypeAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount() = RecipeType.values().size

    override fun createFragment(position: Int): Fragment {
        return RecipeFragment()
    }
}
