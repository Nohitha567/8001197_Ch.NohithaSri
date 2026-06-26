package com.library;

import com.library.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryManagementSpringBootApplication
  implements CommandLineRunner {

  private final BookService service;

  public LibraryManagementSpringBootApplication(BookService service) {
    this.service = service;
  }

  public static void main(String[] args) {
    SpringApplication.run(
      LibraryManagementSpringBootApplication.class,
      args
    );
  }

  @Override
  public void run(String... args) {

    service.saveBook();
  }
}
