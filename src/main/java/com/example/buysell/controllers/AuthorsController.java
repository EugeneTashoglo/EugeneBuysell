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

    @Autowired
    private AuthorsService authorService;

    @GetMapping("/")
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

}
