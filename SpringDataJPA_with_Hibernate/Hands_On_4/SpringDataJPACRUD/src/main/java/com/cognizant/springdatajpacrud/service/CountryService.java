package com.cognizant.springdatajpacrud.service;

import com.cognizant.springdatajpacrud.entity.Country;
import com.cognizant.springdatajpacrud.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

  @Autowired
  private CountryRepository repository;

  public void saveCountries() {

    repository.save(new Country("IN", "India"));
    repository.save(new Country("US", "United States"));
    repository.save(new Country("JP", "Japan"));
    repository.save(new Country("CN", "China"));
    repository.save(new Country("AU", "Australia"));
  }

  // Hands-on 5
  public void testQueries() {

    System.out.println("===== findByName =====");
    System.out.println(repository.findByName("India"));

    System.out.println("\n===== findByNameContaining =====");
    repository.findByNameContaining("a")
      .forEach(System.out::println);

    System.out.println("\n===== findByNameStartingWith =====");
    repository.findByNameStartingWith("U")
      .forEach(System.out::println);

    System.out.println("\n===== findByNameEndingWith =====");
    repository.findByNameEndingWith("a")
      .forEach(System.out::println);
  }

  // Hands-on 6
  public void testCustomQueries() {

    System.out.println("\n===== All Countries =====");
    repository.getAllCountries()
      .forEach(System.out::println);

    System.out.println("\n===== India =====");
    System.out.println(repository.getIndia());

    System.out.println("\n===== Countries containing 'a' =====");
    repository.searchCountry("a")
      .forEach(System.out::println);
  }

  // Hands-on 7
  public void testNativeQueries() {

    System.out.println("\n===== Native Query - All Countries =====");
    repository.getAllCountriesNative()
      .forEach(System.out::println);

    System.out.println("\n===== Country By Code =====");
    System.out.println(repository.getCountryByCode("IN"));

    System.out.println("\n===== Native Search =====");
    repository.searchCountry("a")
      .forEach(System.out::println);
  }

  // Hands-on 8
  public void sortCountries() {

    System.out.println("\n===== Ascending Order =====");
    repository.findAll(Sort.by("name"))
      .forEach(System.out::println);

    System.out.println("\n===== Descending Order =====");
    repository.findAll(Sort.by(Sort.Direction.DESC, "name"))
      .forEach(System.out::println);
  }

  // Hands-on 8
  public void paginateCountries() {

    Pageable pageable = PageRequest.of(0, 3);

    Page<Country> page = repository.findAll(pageable);

    System.out.println("\n===== First Page =====");
    page.getContent().forEach(System.out::println);

    System.out.println("Total Pages : " + page.getTotalPages());
    System.out.println("Total Records : " + page.getTotalElements());
  }
}
