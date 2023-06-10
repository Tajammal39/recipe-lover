package com.example.recipe_lover

import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipe_lover.data.DataSource
import com.example.recipe_lover.myadpter.ItemAdapter

class MainActivity : AppCompatActivity() {
    private val saveImage: ImageView = findViewById(R.id.saving_recipe)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myData = DataSource().recipeDetail()
        val recycler: RecyclerView = findViewById(R.id.recyclerView)
        val adapter = ItemAdapter(myData, this)
        val layoutManager = LinearLayoutManager(this)
//        val layoutManager1 = RelativeLayout(this)
        recycler.adapter = adapter
        recycler.layoutManager = layoutManager

        saveImage.setOnClickListener()
        {
            if (ContextCompat.checkSelfPermission(
                    MainActivity.this,
                    Manifest.permission.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION
                ) == (PackageManager.PERMISSION_GRANTED)
            ) {
                saveRecipe()
            }

        }
    }

}

private fun saveRecipe() {


}


