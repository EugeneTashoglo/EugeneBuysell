    package com.example.buysell.models;

    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    import javax.persistence.*;
    import java.util.Set;

    @Entity
    @Table(name = "categories")
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Categories {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "idCategory")
        private Long idCategory;

        @Column(name = "name")
        private String name;

        // Обновлено для отражения обратной связи с Articles
        @OneToMany(mappedBy = "category")
        private Set<Articles> articles; // Статьи теперь связаны через поле 'category' в классе Articles
    }