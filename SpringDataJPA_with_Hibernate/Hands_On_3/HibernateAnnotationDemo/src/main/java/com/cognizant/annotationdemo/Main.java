package com.cognizant.annotationdemo;

import com.cognizant.annotationdemo.entity.Country;
import com.cognizant.annotationdemo.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

  public static void main(String[] args) {

    Session session = HibernateUtil.getSessionFactory().openSession();

    Transaction transaction = session.beginTransaction();

    Country country = new Country("JP", "Japan");

    session.persist(country);

    transaction.commit();

    session.close();

    System.out.println("Country inserted successfully.");
  }
}
