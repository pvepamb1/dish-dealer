package com.menumanager.repo;

import org.springframework.data.repository.CrudRepository;

import com.menumanager.model.MenuManager;

public interface MenuManagerRepository extends CrudRepository<MenuManager, String> {
	
}
