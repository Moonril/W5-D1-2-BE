package it.epicode.W5_D1_2_BE.bean;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Drink extends Product{
    private boolean alcoholic;
}
