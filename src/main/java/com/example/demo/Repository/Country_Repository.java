package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Country_Entity;

@Repository
public interface Country_Repository extends JpaRepository<Country_Entity, Integer> {



}
