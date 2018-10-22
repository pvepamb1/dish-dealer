package com.menumanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menumanager.model.MenuManager;
import com.menumanager.repo.MenuManagerRepository;

@Service
public class MenuManagerServiceImpl implements MenuManagerService {

	@Autowired
	private MenuManagerRepository repository;
	
	@Override
	public MenuManager addRecipe(MenuManager recipe) {
		return repository.save(recipe);
	}
	
	@Override
	public Iterable<MenuManager> addRecipes(List<MenuManager> recipes) {
		return repository.saveAll(recipes);
	}
	
	@Override
	public Optional<MenuManager> getRecipe(String recipeId) {
		return repository.findById(recipeId);
	}
	
	@Override
	public Iterable<MenuManager> getAllRecipes() {
		return repository.findAll();
	}
	
	@Override
	public void deleteById(String recipeId) {
		repository.deleteById(recipeId);;
	}
	
	@Override
	public void deleteAll() {
		repository.deleteAll();
	}
}
