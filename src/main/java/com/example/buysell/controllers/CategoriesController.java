package com.example.buysell.controllers;

import com.example.buysell.models.Categories;
import com.example.buysell.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/categories")
public class CategoriesController {

    private final CategoriesService categoriesService;

    @Autowired
    public CategoriesController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @GetMapping("/")
    public List<Categories> getAllCategories() {
        return categoriesService.getAllCategories();
    }
}