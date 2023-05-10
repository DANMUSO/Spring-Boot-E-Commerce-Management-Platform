package com.example.springbootwebbasedapp.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "soldproducts")
@Setter
@Getter
@NoArgsConstructor
public class Soldproduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "piece", nullable = false)
    private int piece;
    @Column(name = "in_basket")
    private boolean in_basket;
    @Column(name = "product_id")
    private Long product_id;
    @Column(name = "bill_id")
    private Long bill_id;




}
