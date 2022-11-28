package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Country")
public class Country_Entity {

	@Id
	private int country_id;

	private String name;

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country_Entity() {
		super();
	}

	public Country_Entity(int country_id, String name) {
		super();
		this.country_id = country_id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country_Entity [country_id=" + country_id + ", name=" + name + ", cities=" + "]";
	}

}
