package com.ibm.menu.service;

import java.util.List;

import com.ibm.menu.model.Menu;
import com.ibm.menu.model.MenuItemInput;


public interface MenuService {
	public Menu getMenuItem(String menuItemNumber);
	public List<Menu> getMenuItems();
	public Menu addMenuItem(MenuItemInput menuItemInput);
	
}
