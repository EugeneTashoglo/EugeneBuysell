package com.example.buysell.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "authors")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idAuthor")
    private Long idAuthor;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "surname", columnDefinition = "text")
    private String surname;

    @Column(name = "personalData")
    private int personalData;

    @OneToMany(mappedBy = "author")
    private Set<Articles> articles;

    @OneToMany(mappedBy = "author")
    private Set<AuthorsPayments> authorPayments;

}
