package it.epicode.W5_D1_2_BE.configuration;

import it.epicode.W5_D1_2_BE.bean.Drink;
import it.epicode.W5_D1_2_BE.bean.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    //prodotti finali qua dentro?si

    @Bean
    public Drink getWater(){
        Drink water = new Drink();
        water.setAlo(TipoDrink.ANALCOLICO);
        water.setCalorie(0);
        water.setPrezzo(1);
        water.setNome("Water");
        return water;
    }

    // recuperare il menu dal contesto e stampare il suo contenuto
}
