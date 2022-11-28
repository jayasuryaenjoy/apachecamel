package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City_Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int city_id;
	private String city_name;
	
	@ManyToOne
	private Country_Entity country;

	

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public Country_Entity getCountry() {
		return country;
	}

	public void setCountry(Country_Entity country) {
		this.country = country;
	}

	public City_Entity() {
	}

	public City_Entity(int city_id, String city_name, Country_Entity country) {
		super();
		this.city_id = city_id;
		this.city_name = city_name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "City_Entity [city_id=" + city_id + ", city_name=" + city_name + ", country=" + country + "]";
	}
	

}
