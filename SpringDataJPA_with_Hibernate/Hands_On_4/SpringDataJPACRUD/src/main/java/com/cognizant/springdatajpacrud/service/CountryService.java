package com.cognizant.springdatajpacrud.service;

import com.cognizant.springdatajpacrud.entity.Country;
import com.cognizant.springdatajpacrud.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

  private final CountryRepository repository;

  public CountryService(CountryRepository repository) {
    this.repository = repository;
  }

  public void saveCountries() {

    repository.save(new Country("IN","India"));
    repository.save(new Country("US","United States"));
    repository.save(new Country("JP","Japan"));
    repository.save(new Country("CN","China"));
    repository.save(new Country("AU","Australia"));

  }

  public void testQueries() {

    System.out.println(repository.findByName("India"));

    List<Country> countries =
      repository.findByNameContaining("a");

    countries.forEach(c ->
      System.out.println(c.getCode()+" "+c.getName()));

  }

}
