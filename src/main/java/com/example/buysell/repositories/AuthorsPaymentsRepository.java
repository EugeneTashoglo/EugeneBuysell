package com.example.buysell.repositories;

import com.example.buysell.models.AuthorsPayments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface AuthorsPaymentsRepository extends JpaRepository<AuthorsPayments, Long> {

    List<AuthorsPayments> findByAuthor_Articles_Categories_NameAndPaymentDateBetween(String categoryName, Date startDate, Date endDate);

    List<AuthorsPayments> findByArticle_JournalIssue_IdJournalIssue(Long journalIssueId);

    List<AuthorsPayments> findByAuthor_IdAuthor(Long authorId);

}
