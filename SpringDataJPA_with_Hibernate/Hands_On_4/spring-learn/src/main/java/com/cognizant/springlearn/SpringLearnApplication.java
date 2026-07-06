package com.cognizant.springlearn;

import com.cognizant.springlearn.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SpringLearnApplication {

  private static final Logger LOGGER =
    LoggerFactory.getLogger(SpringLearnApplication.class);

  public static void main(String[] args) {

    SpringApplication.run(SpringLearnApplication.class, args);

    displayDate();

    displayCountry();

    displayCountries();
  }

  // Hands-on 2
  public static void displayDate() {

    LOGGER.info("START - displayDate");

    try {

      ApplicationContext context =
        new ClassPathXmlApplicationContext("date-format.xml");

      SimpleDateFormat format =
        context.getBean("dateFormat", SimpleDateFormat.class);

      Date date = format.parse("31/12/2018");

      LOGGER.debug("Parsed Date : {}", date);

    } catch (Exception e) {

      LOGGER.error("Exception occurred", e);

    }

    LOGGER.info("END - displayDate");
  }

  // Hands-on 4 & 5
  public static void displayCountry() {

    LOGGER.info("START - displayCountry");

    ApplicationContext context =
      new ClassPathXmlApplicationContext("country.xml");

    Country country = context.getBean("in", Country.class);

    Country anotherCountry = context.getBean("in", Country.class);

    LOGGER.debug("Country 1 : {}", country);

    LOGGER.debug("Country 2 : {}", anotherCountry);

    LOGGER.debug("Same Object : {}", country == anotherCountry);

    LOGGER.info("END - displayCountry");
  }

  // Hands-on 6
  @SuppressWarnings("unchecked")
  public static void displayCountries() {

    LOGGER.info("START - displayCountries");

    ApplicationContext context =
      new ClassPathXmlApplicationContext("country.xml");

    List<Country> countries =
      (List<Country>) context.getBean("countryList");

    for (Country country : countries) {

      LOGGER.debug("{}", country);

    }

    LOGGER.info("END - displayCountries");
  }
}
