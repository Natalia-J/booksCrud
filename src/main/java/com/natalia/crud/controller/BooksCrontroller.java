package com.natalia.crud.controller;

import com.natalia.crud.entities.Books;
import com.natalia.crud.repository.BooksRepository;
import com.natalia.crud.service.BooksService;
import com.natalia.crud.service.IBooksService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/books")
public class BooksCrontroller {
private final IBooksService booksService;
BooksCrontroller(BooksService booksService){
    this.booksService = booksService;
}

    @PostMapping
    public ResponseEntity<?> getallBooks(){
        this.booksService.saveBooks();

        return ResponseEntity.ok(Map.of("message","book saved successfully"));
    }
}
