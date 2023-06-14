package com.example.recipe_lover.myadpter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recipe_lover.MyIcon.Companion.myIcon
import com.example.recipe_lover.R
import com.example.recipe_lover.my_recipe.MyRecipe

class ItemAdapter(private val dataSet:List<MyRecipe>,
                  private val context: Context):Adapter<ItemAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View):ViewHolder(itemView){
        val recipeTitle:TextView = itemView.findViewById(R.id.recipeTitle)
        val recipeDescription:TextView = itemView.findViewById(R.id.recipeDescription)
        val recipeImage:ImageView = itemView.findViewById(R.id.image_item)
        val myIcon:ImageView = itemView.findViewById(R.id.my_icon)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
      val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.recipe_list_item,parent,false)
      return MyViewHolder(adapterLayout)
    }
    override fun getItemCount(): Int {
       return dataSet.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = dataSet[position]
        holder.recipeTitle.text=context.resources.getString(item.recipeTitle)
        holder.recipeDescription.text=context.resources.getString(item.recipeDescriptor)
        holder.recipeImage.setImageResource(item.imgResource)
        holder.myIcon.setImageResource(item.IconResource)

        var isIconFilled = false
       holder.myIcon.setOnClickListener {
            if (isIconFilled) {
                // Icon is already filled, remove the fill
                holder.myIcon.setImageResource(item.IconResource)
                isIconFilled = false
            } else {
                // Icon is not filled, fill it
                holder.myIcon.setImageResource(R.drawable.fav_icon_fill)
                isIconFilled = true
            }
        }

    }
}