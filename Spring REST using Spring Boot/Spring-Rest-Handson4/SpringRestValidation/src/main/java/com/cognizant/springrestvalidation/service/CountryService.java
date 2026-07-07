package com.cognizant.springrestvalidation.service;

import com.cognizant.springrestvalidation.model.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

  private final List<Country> countries = new ArrayList<>();

  public CountryService() {

    countries.add(new Country("IN", "India"));
    countries.add(new Country("US", "United States"));
    countries.add(new Country("JP", "Japan"));
    countries.add(new Country("AU", "Australia"));

  }

  public List<Country> getAllCountries() {
    return countries;
  }

  public Country getCountry(String code) {

    return countries.stream()
      .filter(c -> c.getCode().equalsIgnoreCase(code))
      .findFirst()
      .orElse(null);
  }

  public Country addCountry(Country country) {

    countries.add(country);

    return country;
  }
}
