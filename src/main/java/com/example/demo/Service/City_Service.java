package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.City_Entity;
import com.example.demo.Repository.City_Repository;


@Service
public class City_Service  {

	@Autowired
	private City_Repository city_repository;
	
	public List<City_Entity> getCities() {
		return city_repository.findAll();
	}
	
	public City_Entity  saveCity(City_Entity city) {
		
		return city_repository.save(city); 
	}
}
