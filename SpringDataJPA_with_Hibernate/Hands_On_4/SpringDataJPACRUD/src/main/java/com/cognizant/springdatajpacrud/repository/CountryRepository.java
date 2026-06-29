package com.cognizant.springdatajpacrud.repository;

import com.cognizant.springdatajpacrud.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {

  @Query(value = "SELECT * FROM country", nativeQuery = true)
  List<Country> getAllCountriesNative();

  @Query(value = "SELECT * FROM country WHERE code=?1", nativeQuery = true)
  Country getCountryByCode(String code);

  @Query(value = "SELECT * FROM country WHERE name LIKE %?1%", nativeQuery = true)
  List<Country> searchCountry(String keyword);
}
