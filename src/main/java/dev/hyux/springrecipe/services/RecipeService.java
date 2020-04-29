package dev.hyux.springrecipe.services;

import dev.hyux.springrecipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
