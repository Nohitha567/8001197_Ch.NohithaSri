package com.cognizant.springjwtauthentication.controller;

import com.cognizant.springjwtauthentication.model.Country;
import com.cognizant.springjwtauthentication.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

  private final CountryService service;

  public CountryController(CountryService service) {
    this.service = service;
  }

  @GetMapping("/countries")
  public List<Country> getCountries() {

    return service.getAllCountries();

  }
}
