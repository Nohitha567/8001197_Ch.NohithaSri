public Country getCountry(String code) {

  for (Country country : getAllCountries()) {

    if (country.getCode().equalsIgnoreCase(code)) {
      return country;
    }

  }

  throw new CountryNotFoundException("Country not found");
}
