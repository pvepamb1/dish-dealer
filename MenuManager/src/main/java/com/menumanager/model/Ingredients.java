package com.menumanager.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Ingredients {
	
	private String itemName;
	private Double quantity;
	private String unit;
	private String category;
	private boolean required;
	
	public Ingredients() {
		
	}
	
	public Ingredients(String itemNameIn, Double quantityIn, String unitIn, String categoryIn, boolean requiredIn) {
		this.itemName = itemNameIn;
		this.quantity = quantityIn;
		this.unit = unitIn;
		this.category = categoryIn;
		this.required = requiredIn;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	@Override
	public String toString() {
		return "Ingredients [itemName=" + itemName + ", quantity=" + quantity
				+ ", unit=" + unit + ", category=" + category + ", required="
				+ required + "]";
	}
	
}
