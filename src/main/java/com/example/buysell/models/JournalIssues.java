    package com.example.buysell.models;

    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    import javax.persistence.*;
    import java.util.Set;

    @Entity
    @Table(name = "journal_issues")
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class JournalIssues {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "idJournalIssue")
        private Long idJournalIssue;

        @Column(name = "issueNumber")
        private int issueNumber;

        @Column(name = "year")
        private int year;

        @Column(name = "releaseDate")
        private String releaseDate;

        @OneToMany(mappedBy = "journalIssue")
        private Set<Articles> articles;

    }
