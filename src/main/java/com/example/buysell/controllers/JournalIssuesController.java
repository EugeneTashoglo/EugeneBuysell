package com.example.buysell.controllers;

import com.example.buysell.models.JournalIssues;
import com.example.buysell.services.JournalIssuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journal-issues")
public class JournalIssuesController {

    private final JournalIssuesService journalIssuesService;

    @Autowired
    public JournalIssuesController(JournalIssuesService journalIssuesService) {
        this.journalIssuesService = journalIssuesService;
    }

    @GetMapping("/")
    public List<JournalIssues> getAllJournalIssues() {
        return journalIssuesService.getAllJournalIssues();
    }
}