package it.epicode.W5_D1_2_BE.bean;

import it.epicode.W5_D1_2_BE.enums.FormatoPizza;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Pizza extends Product{
    private boolean glutenFree;
    private FormatoPizza formato;
    private List<Topping> toppings;
}
