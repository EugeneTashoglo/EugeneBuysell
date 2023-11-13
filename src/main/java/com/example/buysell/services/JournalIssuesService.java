package com.example.buysell.services;

import com.example.buysell.models.JournalIssues;
import com.example.buysell.repositories.JournalIssuesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalIssuesService {

    @Autowired
    private JournalIssuesRepository journalIssuesRepository;

    public List<JournalIssues> getAllJournalIssues() {
        return journalIssuesRepository.findAll();
    }
}
