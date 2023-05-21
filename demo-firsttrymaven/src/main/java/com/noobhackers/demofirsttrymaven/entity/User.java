package com.noobhackers.demofirsttrymaven.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "users")
@Builder
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name",nullable = false,length = 15)
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
