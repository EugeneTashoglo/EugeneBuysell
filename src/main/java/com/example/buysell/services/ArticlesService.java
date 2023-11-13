package com.example.buysell.services;

import com.example.buysell.models.Articles;
import com.example.buysell.repositories.ArticlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticlesService {

    @Autowired
    private ArticlesRepository articlesRepository;

    public List<Articles> getArticlesByJournalIssue(Long journalIssueId) {
        return articlesRepository.findByJournalIssue_IdJournalIssue(journalIssueId);
    }

    public List<Articles> getArticlesByAuthor(Long authorId) {
        return articlesRepository.findByAuthor_IdAuthor(authorId);
    }

    public List<Articles> getArticlesByCategory(String categoryName) {
        return articlesRepository.findByCategories_Name(categoryName);
    }
}
