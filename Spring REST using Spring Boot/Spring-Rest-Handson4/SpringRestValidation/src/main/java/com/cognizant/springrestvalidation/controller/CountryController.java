package com.cognizant.springrestvalidation.controller;

import com.cognizant.springrestvalidation.model.Country;
import com.cognizant.springrestvalidation.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

  private static final Logger LOGGER =
    LoggerFactory.getLogger(CountryController.class);

  private final CountryService service;

  public CountryController(CountryService service) {
    this.service = service;
  }

  @GetMapping
  public List<Country> getAllCountries() {

    LOGGER.info("GET ALL Countries");

    return service.getAllCountries();
  }

  @GetMapping("/{code}")
  public Country getCountry(@PathVariable String code) {

    LOGGER.info("GET Country {}", code);

    return service.getCountry(code);
  }
  @PostMapping

  public Country addCountry(@RequestBody @Valid Country country) {

    LOGGER.info("Start");

    LOGGER.info("Country Code : {}", country.getCode());

    LOGGER.info("Country Name : {}", country.getName());

    return service.addCountry(country);
  }

  @PutMapping
  public void updateCountry() {

    LOGGER.info("Update Country");

  }

  @DeleteMapping("/{code}")
  public void deleteCountry(@PathVariable String code) {

    LOGGER.info("Delete Country {}", code);

  }
}
