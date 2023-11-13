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

        @ManyToMany(mappedBy = "categories")
        private Set<Articles> articles;

    }
