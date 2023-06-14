package com.example.recipe_lover

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipe_lover.data.DataSource
import com.example.recipe_lover.myadpter.ItemAdapter

class MainActivity() : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val allRecipeBtn: Button = findViewById(R.id.all_recipe_btn)

        allRecipeBtn.setOnClickListener {
            val intent = Intent(this, RecycleListItem::class.java)
            startActivity(intent)
        }

    }

}


