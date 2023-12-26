package com.example.tpp.dao.repositories;

import com.example.tpp.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {
    List<Book> findBookByTitre(String title);
    List<Book> findBooksByPublisherAndPrice(String publisher,double price);
}
