package com.menumanager.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.menumanager.model.MenuManager;
import com.menumanager.service.MenuManagerService;

@RestController
@RequestMapping("/recipes")
public class MenuManagerController {

	public MenuManagerController() {
		
	}
	
	@Autowired
	private MenuManagerService menuManagerService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	MenuManager addRecipe(@RequestBody MenuManager recipe) {
		return menuManagerService.addRecipe(recipe);
	}

	@RequestMapping(value = "/addAll", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	Iterable<MenuManager> addRecipes(@RequestBody List<MenuManager> recipes) {
		return menuManagerService.addRecipes(recipes);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.ACCEPTED)
	@ResponseBody
	Optional<MenuManager> getRecipeById(@PathVariable("id") String recipeId) {
		return menuManagerService.getRecipe(recipeId);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.ACCEPTED)
	@ResponseBody
	Iterable<MenuManager> getAllRecipes() {
		return menuManagerService.getAllRecipes();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	void deleteRecipeById(@PathVariable("id") String recipeId) {
		menuManagerService.deleteById(recipeId);
	}
	
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	void deleteAllRecipes() {
		menuManagerService.deleteAll();
	}
}
