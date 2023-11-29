package com.example.buysell.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "articles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Articles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idArticle")
    private Long idArticle;

    @Column(name = "title")
    private String title;

    @Column(name = "content", columnDefinition = "text")
    private String content;

    // Используйте LocalDate или Date вместо String для даты
    @Column(name = "publicationDate")
    private LocalDate publicationDate; // или private Date publicationDate;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    // Изменено на @ManyToOne
    @ManyToOne
    @JoinColumn(name = "category_id") // Внимание: имя поля в таблице должно совпадать с ERD
    private Categories category; // Изменено на единственное число, так как теперь одна статья связана с одной категорией

    @ManyToOne
    @JoinColumn(name = "journal_issue_id")
    private JournalIssues journalIssue;

    @Column(name = "paymentAmount")
    private BigDecimal paymentAmount;
}