package it.epicode.W5_D1_2_BE.configuration;

import it.epicode.W5_D1_2_BE.bean.*;
import it.epicode.W5_D1_2_BE.enums.StatoTavolo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {
    //prodotti finali qua dentro?si

    @Bean(name = "water")
    public Drink getWater(){
        Drink water = new Drink();
        water.setAlcoholic(false);
        water.setCalories(0);
        water.setPrice(1.00);
        water.setName("Water");
        return water;
    }

    @Bean(name = "lemonade")
    public Drink getLemonade(){
        Drink lemonade = new Drink();
        lemonade.setAlcoholic(false);
        lemonade.setCalories(128);
        lemonade.setPrice(1.29);
        lemonade.setName("Water");
        return lemonade;
    }

    @Bean(name = "wine")
    public Drink getWine(){
        Drink wine = new Drink();
        wine.setAlcoholic(true);
        wine.setCalories(607);
        wine.setPrice(7.49);
        wine.setName("Wine");
        return wine;
    }

    @Bean(name = "mozzarella")
    public Topping getMozzarella(){
        Topping mozzarella = new Topping();
        mozzarella.setName("Mozzarella");
        mozzarella.setPrice(0.69);
        mozzarella.setCalories(92);
        mozzarella.setVegetarian(true);
        return mozzarella;
    }

    @Bean(name = "tomato")
    public Topping getTomato(){
        Topping tomato = new Topping();
        tomato.setName("Tomato");
        tomato.setPrice(1);
        tomato.setCalories(100);
        tomato.setVegetarian(true);
        return tomato;
    }

    @Bean(name = "ham")
    public Topping getHam(){
        Topping ham = new Topping();
        ham.setName("Ham");
        ham.setPrice(0.99);
        ham.setCalories(35);
        ham.setVegetarian(false);
        return ham;
    }

    @Bean(name = "salame")
    public Topping getSalame(){
        Topping salame = new Topping();
        salame.setName("Salame");
        salame.setPrice(0.69);
        salame.setCalories(92);
        salame.setVegetarian(true);
        return salame;
    }

    @Bean(name = "margherita")
    public Pizza getPizzaMargherita(@Qualifier("tomato") Topping tomato,
                                    @Qualifier("mozzarella") Topping mozzarella){
        Pizza margherita = new Pizza();
        margherita.setName("Pizza Margherita");
        margherita.setPrice(4.99);
        margherita.setCalories(1104);
        margherita.setGlutenFree(false);
        margherita.setToppings(List.of(tomato, mozzarella));
        return margherita;
    }

    @Bean(name = "prosciutto")
    public Pizza getPizzaProsciutto(@Qualifier("tomato") Topping tomato,
                                    @Qualifier("mozzarella") Topping mozzarella,
                                    @Qualifier("ham") Topping ham){
        Pizza prosciutto = new Pizza();
        prosciutto.setName("Pizza al Prosciutto");
        prosciutto.setPrice(6.49);
        prosciutto.setCalories(1144);
        prosciutto.setGlutenFree(false);
        prosciutto.setToppings(List.of(tomato, mozzarella, ham));
        return prosciutto;
    }

    @Bean(name = "diavola")
    public Pizza getPizzaSalame(@Qualifier("tomato") Topping tomato,
                                    @Qualifier("mozzarella") Topping mozzarella,
                                    @Qualifier("salame") Topping salame){
        Pizza pizzaSalame = new Pizza();
        pizzaSalame.setName("Pizza Diavola");
        pizzaSalame.setPrice(6.49);
        pizzaSalame.setCalories(1174);
        pizzaSalame.setGlutenFree(false);
        pizzaSalame.setToppings(List.of(tomato, mozzarella, salame));
        return pizzaSalame;
    }

    @Bean(name = "t1")
    public Table getTavolo1(){
        Table t1 = new Table();
        t1.setCostoCoperto(1.5);
        t1.setStatoTavolo(StatoTavolo.LIBERO);
        t1.setNumero(1);
        t1.setNumeroMaxCoperti(6);
        return t1;
    }

    @Bean(name = "t2")
    public Table getTavolo2(){
        Table t2 = new Table();
        t2.setCostoCoperto(2);
        t2.setStatoTavolo(StatoTavolo.LIBERO);
        t2.setNumero(2);
        t2.setNumeroMaxCoperti(2);
        return t2;
    }

    @Bean(name = "menu")
    public Menu getMenu(){
        Menu menu = new Menu();
        return menu;
    }

}
