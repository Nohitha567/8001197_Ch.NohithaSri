package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

  public Country getCountry() {

    return new Country("IN", "India");

  }

}
