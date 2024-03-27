package com.bobwares.prompts.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    @Email
    private String email;

    private String address;
}