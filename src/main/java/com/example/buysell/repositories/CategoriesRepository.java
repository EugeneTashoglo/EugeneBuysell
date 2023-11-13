package com.example.buysell.repositories;

import com.example.buysell.models.Articles;
import com.example.buysell.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {
    Categories findByName(String name);
    List<Categories> findByArticlesIn(List<Articles> articles);
}
