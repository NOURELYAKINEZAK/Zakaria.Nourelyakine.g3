package com.example.tpp.service;

import com.example.tpp.service.dtos.BookDTO;

import java.util.List;

public interface BookManager {
    List<BookDTO> getBookByTitle(String title);
    List<BookDTO> getBookByPublisherAmdPrice(String publisher,double price);
    BookDTO saveBook(BookDTO bookDTO);
    BookDTO deleteBook(Long id);
}
