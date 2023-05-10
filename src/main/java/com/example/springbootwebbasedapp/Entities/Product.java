package com.example.springbootwebbasedapp.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
@Setter
@Getter
@NoArgsConstructor
@SuppressWarnings("deprecation")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column( name ="name", nullable = false)
    private String name;
    @Column( name ="price", nullable = false)
    private int price;
    @Column( name ="productcode", nullable = false)
    private String productcode;

    @Column( name ="stockamount", nullable = false)
    private int stockamount;

    @OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER)

    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private List<Soldproduct> soldproducts = new ArrayList<>();


}
