package com.ibm.menu.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection = "Menu")
public class Menu {
	
	@JsonIgnore
	@Id
	private ObjectId _id;

	private String menuItemNumber;
	private String category;
	private String name;
	private String description;
	private String numAvailable;
	private double price;

	
	public Menu() {
		super();
	}
	
	public Menu(String menuItemNumber, String category, String name, String description, String numAvailable,
			double price) {
		super();
		this.menuItemNumber = menuItemNumber;
		this.category = category;
		this.name = name;
		this.description = description;
		this.numAvailable = numAvailable;
		this.price = price;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((menuItemNumber == null) ? 0 : menuItemNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		if (menuItemNumber == null) {
			if (other.menuItemNumber != null)
				return false;
		} else if (!menuItemNumber.equals(other.menuItemNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Menu [_id=" + _id + ", menuItemNumber=" + menuItemNumber + ", category=" + category + ", name=" + name
				+ ", description=" + description + ", numAvailable=" + numAvailable + ", price=" + price + "]";
	}
}

