package com.cognizant.hibernatexml;

import com.cognizant.hibernatexml.entity.Country;
import com.cognizant.hibernatexml.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

  public static void main(String[] args) {

    Session session = HibernateUtil
      .getSessionFactory()
      .openSession();

    Transaction transaction = session.beginTransaction();

    Country country = new Country("US", "United States");

    session.persist(country);

    transaction.commit();

    session.close();

    System.out.println("Country inserted successfully.");
  }
}
