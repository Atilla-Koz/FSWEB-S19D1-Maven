package com.workintech.s18d2.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "vegatable", schema = "fsweb")
public class Vegatable extends Plant {


    @Column(name = "is_grow_on_tree")
    private boolean isGrowOnTree;
}
