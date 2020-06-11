package com.ibm.menu.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.menu.model.Menu;

import com.ibm.menu.model.MenuItemInput;
import com.ibm.menu.repo.MenuRepo;
import com.ibm.menu.util.GenerateUniqueID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MenuServiceImpl implements MenuService {

	private final Logger logger = LoggerFactory.getLogger(MenuServiceImpl.class);
	
	@Autowired
	private MenuRepo menuRepo;
	
	
	@Override
	public Menu getMenuItem(String menuItemNumber) {
	
		logger.info("Entered Menu getMenuItems().  menuItemNumber=" + menuItemNumber);
		
		Menu menu = null;
		menu = this.menuRepo.findByMenuItemNumber(menuItemNumber);		
		logger.info("Leaving Menu getMenuItems().  menuItemNumber=" + menuItemNumber);
		
		return menu;
	}
	
	@Override
	public List<Menu> getMenuItems() {
			
		List<Menu> menuItems = null;
		
		menuItems = this.menuRepo.findAll();
		
		return menuItems;
	}
	
	@Override
	public Menu addMenuItem(MenuItemInput menuItemInput) {
		
		Menu menuItem = new Menu();
		
		menuItem.setCategory(menuItemInput.getCategory());
		menuItem.setName(menuItemInput.getName());
		menuItem.setDescription(menuItemInput.getDescription());
		menuItem.setNumAvailable(menuItemInput.getNumAvailable());
		menuItem.setPrice(menuItemInput.getPrice());
		
		String menuItemNumber = GenerateUniqueID.GenerateID("MENU");
		menuItem.setMenuItemNumber(menuItemNumber);
		menuItem = this.menuRepo.insert(menuItem);
		return menuItem;
	}
}


