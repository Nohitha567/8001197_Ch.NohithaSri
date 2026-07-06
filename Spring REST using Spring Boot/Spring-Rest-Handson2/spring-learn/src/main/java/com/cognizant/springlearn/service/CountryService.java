package com.cognizant.springlearn.service;

import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.model.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

  public Country getCountry() {
    return new Country("IN", "India");
  }

  public List<Country> getAllCountries() {

    List<Country> countries = new ArrayList<>();

    countries.add(new Country("IN", "India"));
    countries.add(new Country("US", "United States"));
    countries.add(new Country("DE", "Germany"));
    countries.add(new Country("JP", "Japan"));

    return countries;
  }

  public Country getCountry(String code) {

    List<Country> countries = getAllCountries();

    for (Country country : countries) {

      if (country.getCode().equalsIgnoreCase(code)) {
        return country;
      }
    }

    throw new CountryNotFoundException("Country not found");
  }
}
