package com.bobwares.prompts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "orders")
@Data
public class Order {
    @Id
    private String id;
    private String customerId;
    private String productId;
    private Integer quantity;
}