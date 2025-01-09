package com.larrydevincarter.stockanalysis.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "company_table")
@Data
@NoArgsConstructor
public class Company {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String symbol;
}
