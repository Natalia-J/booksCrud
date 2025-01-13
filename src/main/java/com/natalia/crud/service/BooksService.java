package com.natalia.crud.service;


import com.natalia.crud.entities.Books;
import com.natalia.crud.repository.BooksRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class BooksService implements IBooksService{
    private final BooksRepository booksRepository;

    BooksService(BooksRepository booksRepository){
        this.booksRepository = booksRepository;
    }


    @Transactional
    @Override
    public Books saveBooks() {
        Books libroToSave = new Books();
        libroToSave.setId(Long.parseLong("3"));
        libroToSave.setAutor("carlos");
        libroToSave.setClasificacion("sdas");
        libroToSave.setEditorial("asdasdaz");

        return  this.booksRepository.save(libroToSave);

    }
}
