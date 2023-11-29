package com.example.buysell.controllers;

import com.example.buysell.models.Author;
import com.example.buysell.services.AuthorsService;
import com.example.buysell.services.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorsController {

    private final AuthorsService authorsService;

    @Autowired
    public AuthorsController(AuthorsService authorsService) {
        this.authorsService = authorsService;
    }

    @GetMapping("/")
    public List<Author> getAllAuthors() {
        return authorsService.getAllAuthors();
    }

    @GetMapping("/{authorId}")
    public Author getAuthorById(@PathVariable Long authorId) {
        return authorsService.getAuthorById(authorId);
    }
}