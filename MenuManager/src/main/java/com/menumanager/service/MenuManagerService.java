package com.menumanager.service;

import java.util.List;
import java.util.Optional;

import com.menumanager.model.MenuManager;


public interface MenuManagerService {

	Iterable<MenuManager> addRecipes(List<MenuManager> recipes);

	MenuManager addRecipe(MenuManager recipe);

	Optional<MenuManager> getRecipe(String recipeId);

	Iterable<MenuManager> getAllRecipes();

	void deleteById(String recipeId);

	void deleteAll();

}
