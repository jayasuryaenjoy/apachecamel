package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Country_Entity;
import com.example.demo.Repository.Country_Repository;

@Service
public class CountryService {

	@Autowired
	private Country_Repository country_repository;
	
	
	public List<Country_Entity> getCountry() {
		return country_repository.findAll();
	}
	
	public Optional<Country_Entity> countrybyId(int id)
	{
		return country_repository.findById(id);
		
	}
	
	public Country_Entity  saveContry(Country_Entity country) {
		
		 return country_repository.save(country); 
	}
}
