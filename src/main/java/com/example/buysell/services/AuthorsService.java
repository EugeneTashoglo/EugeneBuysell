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

    @Autowired
    private AuthorRepository authorRepository;
    public interface AuthorRepository extends JpaRepository<Author, Long> {
        List<Articles> findArticlesByAuthorId(Long authorId);
    }


    @Autowired
    private AuthorsPaymentsService authorsPaymentsService;
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public List<Articles> getArticlesAndPaymentsByAuthor(Long authorId) {
        Author author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            List<AuthorsPayments> payments = authorsPaymentsService.getPaymentsByAuthor(authorId);

            return payments.stream()
                    .map(payment -> {
                        Articles article = new Articles();
                        article.setPaymentAmount(payment.getPaymentAmount());
                        return article;
                    })
                    .collect(Collectors.toList());
        }
        return Collections.emptyList();
    }
}
