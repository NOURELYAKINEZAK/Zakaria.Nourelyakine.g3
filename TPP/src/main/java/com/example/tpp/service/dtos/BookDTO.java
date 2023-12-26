package com.example.tpp.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date ;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BookDTO {
    private String titre;
    private  String publisher;
    private Date datePublication;
    private double price;
    private String resume;
}
