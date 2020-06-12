package com.ibm.menu.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.ibm.menu.model.Menu;

import com.ibm.menu.repo.MenuRepo;


class MenuServiceImplTest {

	@Mock
	private MenuRepo menuRepo;
	
	@InjectMocks
	private MenuServiceImpl menuService;
	
	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@DisplayName("Test addMenuItem w/ a valid menuItemNumber")
	@Test
	public void testGetMenuItemValidMenuItemNumber() {
		//Given
		String menuItemNumber = "MENU-554";	
		Menu mockedMenu = null;
		
		mockedMenu = new Menu(menuItemNumber,"Entry","Salmon","grilled Salmon","2",12.95);
		//mockedMenu = menuRepo.findByMenuItemNumber(menuItemNumber);		
			
		//when
		when(menuRepo.findByMenuItemNumber(menuItemNumber)).thenReturn(mockedMenu);
			
		Menu menu = menuService.getMenuItem(menuItemNumber);
		
		//Then
		assertNotNull(menu, "menu should not be null");
		assertEquals(menu, mockedMenu, "menu should be the same as: " + mockedMenu);
		
		verify(menuRepo).findByMenuItemNumber(menuItemNumber);
		
		//public MenuItemInput(String menuItemNumber, String category, String name, String description, String numAvailable, Double price) {
	}

}
