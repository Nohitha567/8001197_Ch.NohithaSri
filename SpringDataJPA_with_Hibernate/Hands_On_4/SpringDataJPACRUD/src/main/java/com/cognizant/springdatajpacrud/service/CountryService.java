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

    System.out.println(CountryRepository.findByName("India"));

    List<Country> countries =
      CountryRepository.findByNameContaining("a");

    countries.forEach(c ->
      System.out.println(c.getCode()+" "+c.getName()));

  }
  public void testCustomQueries() {

    System.out.println("All Countries");

    repository.getAllCountries()
      .forEach(System.out::println);

    System.out.println();

    System.out.println("India");

    System.out.println(repository.getIndia());

    System.out.println();

    System.out.println("Contains 'a'");

    repository.searchCountry("a")
      .forEach(System.out::println);
  }
  public void testNativeQueries() {

    System.out.println("===== All Countries =====");

    repository.getAllCountriesNative()
      .forEach(System.out::println);

    System.out.println();

    System.out.println("===== Country By Code =====");

    System.out.println(repository.getCountryByCode("IN"));

    System.out.println();

    System.out.println("===== Countries Containing 'a' =====");

    repository.searchCountry("a")
      .forEach(System.out::println);
  }

}
