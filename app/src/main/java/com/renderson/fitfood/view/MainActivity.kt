package com.renderson.fitfood.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.renderson.fitfood.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container, MainFragment())
                .commitNow()
        }
    }
}


