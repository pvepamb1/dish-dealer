package com.menumanager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MenuManager {
	
	@Id
	private String recipeId;
	private Recipe recipe;
	
	public MenuManager() {
		
	}
	
	public MenuManager(String recipeIdIn, Recipe recipeIn) {
		this.recipeId = recipeIdIn;
		this.recipe = recipeIn;
	}
	
	public String getRecipeId() {
		return recipeId;
	}
	
	public void setRecipeId(String recipeId) {
		this.recipeId = recipeId;
	}
	
	public Recipe getRecipe() {
		return recipe;
	}
	
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	@Override
	public String toString() {
		return "MenuManager [recipeId=" + recipeId + ", recipe=" + recipe
				+ ", getRecipeId()=" + getRecipeId() + ", getRecipe()="
				+ getRecipe() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
