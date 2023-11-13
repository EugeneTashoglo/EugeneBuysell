package com.example.buysell.repositories;

import com.example.buysell.models.JournalIssues;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JournalIssuesRepository extends JpaRepository<JournalIssues, Long> {
    JournalIssues findByIssueNumber(int issueNumber);
}