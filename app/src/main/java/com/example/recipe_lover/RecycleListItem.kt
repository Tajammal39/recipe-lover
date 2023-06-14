package com.example.recipe_lover

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipe_lover.MyIcon.Companion.myIcon

import com.example.recipe_lover.data.DataSource
import com.example.recipe_lover.myadpter.ItemAdapter


class RecycleListItem : AppCompatActivity() {
//    @SuppressLint("MissingInflatedId")


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_list_item)

        // create object for saving data
        val myData = DataSource().recipeDetail()

        //recycler view resource id
        val recycler: RecyclerView = findViewById(R.id.recyclerView)

        //implement adapter
        val adapter = ItemAdapter(myData, this)
        val layoutManager = LinearLayoutManager(this)

        //adapter send data to recycler view
        recycler.adapter = adapter
        recycler.layoutManager = layoutManager


       //check icon fill or icon unfilled

    }
}