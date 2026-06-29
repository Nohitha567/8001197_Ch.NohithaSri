package com.cognizant.springdatajpacrud.repository;

import com.cognizant.springdatajpacrud.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
}
