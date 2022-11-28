package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Country_Entity;
import com.example.demo.Service.CountryService;

@RestController
public class Country_Controller {

	
	@Autowired
	private CountryService countrycontroller;
	
	@GetMapping("/Country")
	public List<Country_Entity> getCountry() {
		return countrycontroller.getCountry();
	}
	
	@PostMapping("/addcountry")
	public Country_Entity savecity(@RequestBody Country_Entity country) {
		return countrycontroller.saveContry(country	);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Country_Entity> countrybyId(@PathVariable ("id") int id)
	{
		return countrycontroller.countrybyId(id);
	}
	
}
