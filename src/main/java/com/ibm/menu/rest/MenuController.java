package com.ibm.menu.rest;




import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.menu.model.Menu;
import com.ibm.menu.model.MenuItemInput;
import com.ibm.menu.service.MenuService;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(value = "/menu")
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	private final Logger logger = LoggerFactory.getLogger(MenuController.class);

	// URL: http://ip-address:port/menu/menu (POST request)
	@RequestMapping(value = "/menu", method = RequestMethod.POST)
	public ResponseEntity<?> addMenuItem(@RequestBody MenuItemInput menuItemInput) {

		Menu menu = this.menuService.addMenuItem(menuItemInput);
		ResponseEntity<Menu> responseEntity = new ResponseEntity<Menu>(menu, HttpStatus.OK);
		return responseEntity;
	}
   
	// URL: http://ip-address:port/menu/menuItemNumber/O123 (GET request)
	@RequestMapping(value = "/menu/{menuItemNumber}")
	public ResponseEntity<?> getMenu(@PathVariable(value="menuItemNumber") String menuItemNumber) {

		logger.info("Entered MenuController.getMenu().  menuItemNumber=" + menuItemNumber);
		Menu menu = this.menuService.getMenuItem(menuItemNumber);
		logger.debug("MenuController.getMenu().  menu=" + menuItemNumber);
		ResponseEntity<Menu> responseEntity = new ResponseEntity<Menu>(menu, HttpStatus.OK);
		return responseEntity;
   }
   
   // URL: http://ip-address:port/menu/menuitems (GET request)
   @RequestMapping(value = "/menuitems")
   public ResponseEntity<?> getMenuItems() {
	   
	   List<Menu> menuItems = this.menuService.getMenuItems();
	   ResponseEntity<List<Menu>> responseEntity = new ResponseEntity<List<Menu>>(menuItems, HttpStatus.OK);
	   return responseEntity;
   }
}   
   