package it.epicode.W5_D1_2_BE.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public abstract class Product {
    private String name;
    private int price;
    private int calories;
}
