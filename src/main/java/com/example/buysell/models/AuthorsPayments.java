package com.example.buysell.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "author_payments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorsPayments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idAuthorPayment")
    private Long idAuthorPayment;

    @Column(name = "paymentAmount")
    private BigDecimal paymentAmount;

    @Column(name = "paymentDate")
    private Date paymentDate;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;


}
