package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.City_Entity;
import com.example.demo.Entity.Country_Entity;
import com.example.demo.Service.City_Service;

@RestController()
public class City_Controller {

	@Autowired
	private City_Service city_service;

	@GetMapping("/getCities")
	public List<City_Entity> getCities() {

		return city_service.getCities();
	}
	
	@PostMapping("/addcity/{id}")
	public City_Entity savecity(@PathVariable int id, @RequestBody City_Entity city) {
		city.setCountry(new Country_Entity(id,""));
		return city_service.saveCity(city);
	}
	
	
	@GetMapping("/hello")
	ResponseEntity<String> hello() {
	    return new ResponseEntity<>("Hello World!", HttpStatus.OK);
	}
}
