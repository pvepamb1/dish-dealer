package com.menumanager.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.menumanager.util.MenuManagerConstants.Category;

@Document
public class Recipe {

	private String title;
	private Category category;
	private String cusine;
	private List<Ingredients> ingredients;
	private String desc;
	private int serves;
	
	public Recipe() {
		
	}
	
	public Recipe(String titleIn, Category categoryIn, String cusineIn, List<Ingredients> ingredientsIn, String descIn, int servesIn) {
		this.title = titleIn;
		this.category = categoryIn;
		this.cusine = cusineIn;
		this.ingredients = ingredientsIn;
		this.desc = descIn;
		this.serves = servesIn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getCusine() {
		return cusine;
	}

	public void setCusine(String cusine) {
		this.cusine = cusine;
	}

	public List<Ingredients> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredients> ingredients) {
		this.ingredients = ingredients;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getServes() {
		return serves;
	}

	public void setServes(int serves) {
		this.serves = serves;
	}
	
	@Override
	public String toString() {
		return "Recipe [title=" + title + ", category=" + category
				+ ", cusine=" + cusine + ", ingredients=" + ingredients
				+ ", desc=" + desc + ", serves=" + serves + ", getTitle()="
				+ getTitle() + ", getCategory()=" + getCategory()
				+ ", getCusine()=" + getCusine() + ", getIngredients()="
				+ getIngredients() + ", getDesc()=" + getDesc()
				+ ", getServes()=" + getServes() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
