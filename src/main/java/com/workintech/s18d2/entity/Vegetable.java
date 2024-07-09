package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Entity
@Table(name = "vegetable", schema = "fsweb")
public class Vegetable extends Plant {

    @Column(name = "grown_on_tree")
    private boolean grownOnTree;
}
