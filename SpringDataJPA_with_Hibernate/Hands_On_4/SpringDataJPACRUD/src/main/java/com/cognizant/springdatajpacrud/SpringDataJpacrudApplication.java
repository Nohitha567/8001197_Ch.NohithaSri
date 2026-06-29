package com.cognizant.springdatajpacrud;

import com.cognizant.springdatajpacrud.service.CountryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpacrudApplication implements CommandLineRunner {

  private final CountryService service;

  public SpringDataJpacrudApplication(CountryService service) {
    this.service = service;
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringDataJpacrudApplication.class, args);
  }

  @Override
  public void run(String... args) {

    service.saveCountries();

    service.testQueries();

  }
}
