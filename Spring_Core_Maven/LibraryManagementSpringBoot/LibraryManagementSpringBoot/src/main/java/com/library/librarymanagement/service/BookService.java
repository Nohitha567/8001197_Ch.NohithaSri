package com.library.service;

import com.library.librarymanagement.entity.Book;
import com.library.librarymanagement.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  private final BookRepository repository;

  public BookService(BookRepository repository) {
    this.repository = repository;
  }

  public void saveBook() {

    Book book = new Book(
      "Spring Boot",
      "Rod Johnson"
    );

    repository.save(book);

    System.out.println("Book Saved Successfully");
  }
}
