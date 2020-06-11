package com.ibm.menu.model;

public class MenuItemInput {

	private String menuItemNumber;
	private String category;
	private String name;
	private String description;
	private String numAvailable;
	private Double price;
	public MenuItemInput(String menuItemNumber, String category, String name, String description, String numAvailable, Double price) {
		super();
		this.menuItemNumber = menuItemNumber;
		this.category = category;
		this.name = name;
		this.description = description;
		this.numAvailable = numAvailable;
		this.price = price;
	}
	public String getMenuItemNumber() {
		return menuItemNumber;
	}
	public void setMenuItemNumber(String menuItemNumber) {
		this.menuItemNumber = menuItemNumber;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNumAvailable() {
		return numAvailable;
	}
	public void setNumAvailable(String numAvailable) {
		this.numAvailable = numAvailable;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "MenuItemInput [category=" + category + ", name=" + name + ", description=" + description
				+ ", numAvailable=" + numAvailable + ", price=" + price + "]";
	}
	
	
}
