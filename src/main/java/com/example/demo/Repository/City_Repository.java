package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.City_Entity;

@Repository
public interface City_Repository extends JpaRepository<City_Entity, Integer> {

}
