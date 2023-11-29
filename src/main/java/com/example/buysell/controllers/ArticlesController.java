package com.example.buysell.controllers;

import com.example.buysell.models.Articles;
import com.example.buysell.services.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticlesController {

    private final ArticlesService articlesService;

    @Autowired
    public ArticlesController(ArticlesService articlesService) {
        this.articlesService = articlesService;
    }

    @GetMapping("/journalIssue/{journalIssueId}")
    public List<Articles> getArticlesByJournalIssue(@PathVariable Long journalIssueId) {
        return articlesService.getArticlesByJournalIssue(journalIssueId);
    }

    @GetMapping("/author/{authorId}")
    public List<Articles> getArticlesByAuthor(@PathVariable Long authorId) {
        return articlesService.getArticlesByAuthor(authorId);
    }

    @GetMapping("/category/{categoryName}")
    public List<Articles> getArticlesByCategory(@PathVariable String categoryName) {
        return articlesService.getArticlesByCategory(categoryName);
    }

    // Дополнительные методы, если они вам нужны...
}