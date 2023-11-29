package com.example.buysell.repositories;

import com.example.buysell.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    // Здесь вы можете добавить свои собственные запросы, например:
    List<Author> findBySurname(String surname);
}