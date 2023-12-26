package com.example.tpp.service.mappers;

import com.example.tpp.dao.entities.Book;
import com.example.tpp.service.dtos.BookDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public Book fromBookDtoToBook(BookDTO bookDTO){
        return this.modelMapper.map(bookDTO,Book.class);
    }

    public BookDTO fromBookToBookDto(Book book ){
        return this.modelMapper.map(book,BookDTO.class);
    }

}
