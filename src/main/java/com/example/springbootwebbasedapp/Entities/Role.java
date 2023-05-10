package com.example.springbootwebbasedapp.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name = "roles")
@Setter
@Getter
@NoArgsConstructor
@SuppressWarnings("deprecation")
public class Role {

    @Id

    @GeneratedValue( strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name ="name", nullable = false)
    private String name;

    @ManyToMany(mappedBy = "roles")

    private List<User> users;

}
