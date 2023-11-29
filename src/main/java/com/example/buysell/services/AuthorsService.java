package com.example.buysell.services;

import com.example.buysell.models.Articles;
import com.example.buysell.models.AuthorsPayments;
import com.example.buysell.models.Author;
import com.example.buysell.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorsService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorsService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
    public Author getAuthorById(Long authorId) {
        return authorRepository.findById(authorId).orElse(null);
    }
    public Author getAuthorDetails(Long id) {
        return authorRepository.findById(id).orElse(null); // Возвращаем автора или null, если автор не найден
    }
}