package it.epicode.W5_D1_2_BE.bean;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@Entity
@ToString(callSuper = true)
public class Topping extends Product{
    private boolean vegetarian;
}
