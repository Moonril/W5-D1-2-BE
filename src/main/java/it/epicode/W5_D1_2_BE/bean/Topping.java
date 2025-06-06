package it.epicode.W5_D1_2_BE.bean;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@ToString(callSuper = true)
public class Topping extends Product{
    private boolean vegetarian;

    @ManyToMany
    @JoinTable(name = "topping_pizza",joinColumns = @JoinColumn(name = "topping_id"), inverseJoinColumns = @JoinColumn(name = "pizza_id"))
    private List<Pizza> pizze;

}
