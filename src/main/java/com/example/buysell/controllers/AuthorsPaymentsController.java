package com.example.buysell.controllers;

import com.example.buysell.models.AuthorsPayments;
import com.example.buysell.services.AuthorsPaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/authors-payments")
public class AuthorsPaymentsController {

    private final AuthorsPaymentsService authorsPaymentsService;

    @Autowired
    public AuthorsPaymentsController(AuthorsPaymentsService authorsPaymentsService) {
        this.authorsPaymentsService = authorsPaymentsService;
    }

    @GetMapping("/journal-issue/{journalIssueId}/total-payments")
    public BigDecimal getTotalPaymentsForJournalIssue(@PathVariable Long journalIssueId) {
        return authorsPaymentsService.calculateTotalPaymentsByJournalIssue(journalIssueId);
    }
    @GetMapping("/author/{authorId}/total-payments")
    public BigDecimal getTotalPaymentsForAuthor(@PathVariable Long authorId) {
        return authorsPaymentsService.calculateTotalPaymentsByAuthor(authorId);
    }
    @GetMapping("/category-payments")
    public BigDecimal getTotalPaymentsForCategoryInPeriod(
            @RequestParam String categoryName,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
        return authorsPaymentsService.calculateTotalPaymentsByCategoryAndPeriod(categoryName, startDate, endDate);
    }
}