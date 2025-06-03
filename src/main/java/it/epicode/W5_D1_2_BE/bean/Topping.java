package it.epicode.W5_D1_2_BE.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Topping extends Product{
    private boolean vegetarian;
}
