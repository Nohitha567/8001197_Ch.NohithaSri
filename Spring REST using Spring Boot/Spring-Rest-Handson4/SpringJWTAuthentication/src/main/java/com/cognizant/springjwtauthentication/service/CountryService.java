package com.cognizant.springjwtauthentication.service;

import com.cognizant.springjwtauthentication.model.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

  private final List<Country> countries = new ArrayList<>();

  public CountryService() {

    countries.add(new Country("US","United States"));
    countries.add(new Country("DE","Germany"));
    countries.add(new Country("IN","India"));
    countries.add(new Country("JP","Japan"));

  }

  public List<Country> getAllCountries() {
    return countries;
  }
}
