package it.epicode.W5_D1_2_BE.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Drink extends Product{
    private boolean alcoholic;
}
