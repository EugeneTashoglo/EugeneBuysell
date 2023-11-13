package com.example.buysell.services;

import com.example.buysell.models.AuthorsPayments;
import com.example.buysell.repositories.AuthorsPaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class AuthorsPaymentsService {

    @Autowired
    private AuthorsPaymentsRepository authorsPaymentsRepository;

    public List<AuthorsPayments> getPaymentsByJournalIssue(Long journalIssueId) {
        return authorsPaymentsRepository.findByArticle_JournalIssue_IdJournalIssue(journalIssueId);
    }

    public List<AuthorsPayments> getPaymentsByAuthor(Long authorId) {
        return authorsPaymentsRepository.findByAuthor_IdAuthor(authorId);
    }

    public BigDecimal calculateTotalPaymentsByJournalIssue(Long journalIssueId) {
        List<AuthorsPayments> payments = getPaymentsByJournalIssue(journalIssueId);
        return calculateTotalPayments(payments);
    }

    public BigDecimal calculateTotalPaymentsByCategoryAndPeriod(String categoryName, Date startDate, Date endDate) {
        List<AuthorsPayments> payments = authorsPaymentsRepository.findByAuthor_Articles_Categories_NameAndPaymentDateBetween(categoryName, startDate, endDate);
        return calculateTotalPayments(payments);
    }


    private BigDecimal calculateTotalPayments(List<AuthorsPayments> payments) {
        return payments.stream()
                .map(AuthorsPayments::getPaymentAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
