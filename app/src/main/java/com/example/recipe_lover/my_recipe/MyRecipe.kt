package com.example.recipe_lover.my_recipe

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.io.FileDescriptor

data class MyRecipe (@StringRes val recipeTitle:Int,
                     @StringRes val recipeDescriptor:Int,
                      @DrawableRes val imgResource:Int)
