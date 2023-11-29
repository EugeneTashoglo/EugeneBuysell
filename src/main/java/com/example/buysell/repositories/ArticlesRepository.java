package com.example.buysell.repositories;

import com.example.buysell.models.Articles;
import com.example.buysell.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticlesRepository extends JpaRepository<Articles, Long> {
    List<Articles> findByAuthor_IdAuthor(Long authorId);
    List<Articles> findByCategory(Categories category); // Заменен метод для поиска по одной категории
    List<Articles> findByJournalIssue_IdJournalIssue(Long journalIssueId);
    List<Articles> findByCategory_Name(String categoryName);

}
