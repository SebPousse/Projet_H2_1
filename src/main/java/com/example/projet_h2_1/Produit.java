package com.example.projet_h2_1;

import javax.persistence.*;

@Entity
@Table(name = "produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "marque")
    private String marque;

    @Column(name = "prix")
    private int prix;
}