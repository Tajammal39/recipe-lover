package com.example.recipe_lover.data

import com.example.recipe_lover.R
import com.example.recipe_lover.my_recipe.MyRecipe

class DataSource {

    fun recipeDetail(): List<MyRecipe> {
        return listOf(
            MyRecipe(R.string.recipeTitle1, R.string.recipeDescription1, R.drawable.friedrice,R.drawable.fav_icon),
            MyRecipe(R.string.recipeTitle1, R.string.recipeDescription1, R.drawable.friedrice,R.drawable.fav_icon),
            MyRecipe(R.string.recipeTitle1, R.string.recipeDescription1, R.drawable.friedrice,R.drawable.fav_icon),
            MyRecipe(R.string.recipeTitle1, R.string.recipeDescription1, R.drawable.friedrice,R.drawable.fav_icon),
            MyRecipe(R.string.recipeTitle1, R.string.recipeDescription1, R.drawable.friedrice,R.drawable.fav_icon),
            MyRecipe(R.string.recipeTitle1, R.string.recipeDescription1, R.drawable.friedrice,R.drawable.fav_icon),

        )
    }
}

