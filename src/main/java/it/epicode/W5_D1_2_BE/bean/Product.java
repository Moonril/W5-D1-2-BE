package it.epicode.W5_D1_2_BE.bean;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double price;
    private int calories;

    @ManyToOne
    @JoinColumn(name = "ordine_id")
    private Ordine ordine;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
}
