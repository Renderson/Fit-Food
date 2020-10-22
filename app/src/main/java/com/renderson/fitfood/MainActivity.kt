package com.renderson.fitfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.recyclerTopics

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerTopics.adapter = TmpAdapter()
    }
}

class TmpAdapter : RecyclerView.Adapter<TmpView>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TmpView {
        return TmpView(
                LayoutInflater.from(parent.context).inflate(
                        android.R.layout.simple_list_item_1,
                        parent, false
                )
        )
    }

    override fun onBindViewHolder(holder: TmpView, position: Int) {
        (holder.itemView as TextView).text = "$position pos"
    }

    override fun getItemCount(): Int {
        return 30
    }

}
class TmpView(itemView: View) : RecyclerView.ViewHolder(itemView){}


