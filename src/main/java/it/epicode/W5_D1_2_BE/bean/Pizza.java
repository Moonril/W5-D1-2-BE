package it.epicode.W5_D1_2_BE.bean;

import it.epicode.W5_D1_2_BE.enums.FormatoPizza;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@ToString(callSuper = true)
public class Pizza extends Product{
    private boolean glutenFree;
    @Enumerated(EnumType.STRING)
    private FormatoPizza formato;

    @ManyToMany(mappedBy = "pizze")
    private List<Topping> toppings;
}
