package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.entity.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

  @Autowired
  private CountryRepository repository;

  public void addCountry() {

    Country country =
      new Country("IN", "India");

    repository.save(country);

    System.out.println("Country Saved Successfully");
  }
}
