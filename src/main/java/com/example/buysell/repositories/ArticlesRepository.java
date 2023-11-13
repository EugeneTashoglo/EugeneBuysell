package com.example.buysell.repositories;

import com.example.buysell.models.Articles;
import com.example.buysell.models.Author;
import com.example.buysell.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticlesRepository extends JpaRepository<Articles, Long> {
    List<Articles> findByAuthor(Author author);
    List<Articles> findByCategoriesIn(List<Categories> categories);
    List<Articles> findByJournalIssue_IdJournalIssue(Long journalIssueId);
    List<Articles> findByAuthor_IdAuthor(Long authorId);
    List<Articles> findByCategories_Name(String categoryName);
}
