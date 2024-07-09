package com.workintech.s18d2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MappedSuperclass
public class Plant {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column(name = "name")
    @NotNull(message = "name cannot be null")
    @Size(min = 2, max = 45, message = "name must be between 2 and 45 characters")
    private String name;

    @Column(name = "price")
    @DecimalMin("10")
    private double price;
}
