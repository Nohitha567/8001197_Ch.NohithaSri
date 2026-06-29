package com.cognizant.springdatajpacrud.service;

import com.cognizant.springdatajpacrud.entity.Country;
import com.cognizant.springdatajpacrud.repository.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

  private final CountryRepository repository;

  public CountryService(CountryRepository repository) {
    this.repository = repository;
  }

  public void saveCountry() {
    repository.save(new Country("IN", "India"));
    System.out.println("Country Saved Successfully");
  }
}
