package com.library.service;

import com.library.entity.Book;
import org.springframework.stereotype.Service;


@Service
public class BookService {


  public void saveBook() {

    Book book = new Book("Spring Framework", "Rod Johnson");

    System.out.println("Saving Book...");
    System.out.println("Title : " + book.getTitle());
    System.out.println("Author : " + book.getAuthor());

    System.out.println("Book Saved Successfully");
  }
}
