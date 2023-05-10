package com.example.springbootwebbasedapp.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="bills")
@SuppressWarnings("deprecation")
@Setter
@Getter
@NoArgsConstructor
public class Bill {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name ="customerName")
    private String customerName;

    @Column(name ="customerUsername")
    private String customerUsername;

    @Column(name = "totalprice")
    private int totalprice;

    @Column(name = "bill_date")
    private Date bill_date;

    @Column(name = "admin_confirm")
    private boolean admin_confirm;

    @Column(name = "employee_confirm")
    private boolean employee_confirm;

    @OneToMany

    @JoinColumn(name ="bill_id", referencedColumnName = "id")
    List<Soldproduct> soldproducts = new ArrayList<>();





}
