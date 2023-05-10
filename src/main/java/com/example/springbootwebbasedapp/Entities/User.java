package com.example.springbootwebbasedapp.Entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@SuppressWarnings("deprecation")
@Entity
@Table( name ="users")
@Setter
@Getter
@NoArgsConstructor
public class User {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "phone", nullable = false, unique = true)
    private  String phone;
    @Column(name = "password", nullable = false)
    @Size(min = 6)
    private String password;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable( name = "user_role",
            joinColumns =
                    {
                     @JoinColumn(name ="user_id",
                     referencedColumnName = "id")
                    },
                  inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")} )
    private List<Role> roles;
}
