package com.library;

import com.library.entity.Book;
import com.library.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LibraryManagementApplication {

  public static void main(String[] args) {

    Session session =
      HibernateUtil.getSessionFactory().openSession();

    Transaction transaction =
      session.beginTransaction();

    Book book =
      new Book("Spring Core", "Rod Johnson");

    session.save(book);

    transaction.commit();

    session.close();

    System.out.println("Book Saved Successfully");
  }
}
