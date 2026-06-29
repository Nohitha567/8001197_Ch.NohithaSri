package com.cognizant.springdatajpacrud.repository;

import com.cognizant.springdatajpacrud.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {

  Country findByName(String name);

  List<Country> findByNameContaining(String keyword);

  @Query("SELECT c FROM Country c")
  List<Country> getAllCountries();

  @Query("SELECT c FROM Country c WHERE c.name='India'")
  Country getIndia();

  @Query("SELECT c FROM Country c WHERE c.name LIKE %?1%")
  List<Country> searchCountry(String keyword);

}
