package com.example.buysell.controllers;

import com.example.buysell.models.AuthorsPayments;
import com.example.buysell.services.AuthorsPaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/authors-payments")
public class AuthorsPaymentsController {

    @Autowired
    private AuthorsPaymentsService authorsPaymentsService;

}
