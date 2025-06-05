package it.epicode.W5_D1_2_BE.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@ToString(exclude = "prodotti")
//@Component // le altre classi no component. QUANDO C?é COMPOMENT NON VA FATTO IL BEAN
public class Menu {

    @Id
    @GeneratedValue
    private int id;
    //@Autowired
    private List<Product> products;

    @OneToMany(mappedBy = "menu")
    private List<Product> prodotti;

    @OneToMany(mappedBy = "menu")
    private List<Table> table;

    //metodo per la stampa di tutti i prodotti del menu
    public void stampaManu(){
        System.out.println("Drink");
        products.stream().filter(product -> product instanceof Drink).forEach(System.out::println);

        System.out.println();
        System.out.println("Toppings");
        products.stream().filter(product -> product instanceof Topping).forEach(System.out::println);

        System.out.println();
        System.out.println("Pizza");
        products.stream().filter(product -> product instanceof Pizza).forEach(System.out::println);
    }
}
