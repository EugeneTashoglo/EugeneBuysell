package com.example.buysell.services;

import com.example.buysell.models.Articles;
import com.example.buysell.models.Author;
import com.example.buysell.repositories.ArticlesRepository;
import com.example.buysell.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticlesService {

    private final ArticlesRepository articlesRepository;
    private final AuthorRepository authorRepository;  // Добавлено поле для AuthorRepository

    @Autowired
    public ArticlesService(ArticlesRepository articlesRepository, AuthorRepository authorRepository) {
        this.articlesRepository = articlesRepository;
        this.authorRepository = authorRepository;  // Инициализация authorRepository
    }

    public List<Articles> getArticlesByJournalIssue(Long journalIssueId) {
        return articlesRepository.findByJournalIssue_IdJournalIssue(journalIssueId);
    }
    public List<Articles> getArticlesByAuthor(Long authorId) {
        return articlesRepository.findByAuthor_IdAuthor(authorId);
    }

    public List<Articles> getArticlesByCategory(String categoryName) {
        return articlesRepository.findByCategory_Name(categoryName);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();  // Теперь это должно работать правильно
    }
}
