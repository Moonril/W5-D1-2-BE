package it.epicode.W5_D1_2_BE;


import it.epicode.W5_D1_2_BE.bean.*;
import it.epicode.W5_D1_2_BE.repos.MenuRepository;
import it.epicode.W5_D1_2_BE.repos.OrdineRepository;
import it.epicode.W5_D1_2_BE.repos.ProductRepository;
import it.epicode.W5_D1_2_BE.repos.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Order(1)
public class Runner implements CommandLineRunner {

    @Autowired
    private MenuRepository menuRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrdineRepository ordineRepository;
    @Autowired
    private TableRepository tableRepository;


    @Autowired
    @Qualifier("water")
    private Drink water;
    @Autowired
    @Qualifier("lemonade")
    private Drink lemonade;
    @Autowired
    @Qualifier("wine")
    private Drink wine;

    @Autowired
    @Qualifier("mozzarella")
    private Topping mozzarella;
    @Autowired
    @Qualifier("tomato")
    private Topping tomato;
    @Autowired
    @Qualifier("ham")
    private Topping ham;
    @Autowired
    @Qualifier("salame")
    private Topping salame;

    @Autowired
    @Qualifier("margherita")
    private Pizza margherita;
    @Autowired
    @Qualifier("prosciutto")
    private Pizza prosciutto;
    @Autowired
    @Qualifier("diavola")
    private Pizza diavola;

    @Autowired
    @Qualifier("t1")
    private Table t1;
    @Autowired
    @Qualifier("t2")
    private Table t2;



    @Autowired
    private Menu menu;


    @Override
    public void run(String... args) throws Exception {

        productRepository.save(water);
        productRepository.save(lemonade);
        productRepository.save(wine);

        productRepository.save(margherita);
        productRepository.save(prosciutto);
        productRepository.save(diavola);

        productRepository.save(salame);
        productRepository.save(mozzarella);
        productRepository.save(tomato);


        mozzarella.setPizze(List.of(margherita, prosciutto, diavola));

        tomato.setPizze(List.of(margherita, diavola, prosciutto));

        salame.setPizze(List.of(diavola));

        productRepository.save(mozzarella);
        productRepository.save(tomato);
        productRepository.save(salame);
    }
}
