package it.epicode.W5_D1_2_BE.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // le altre classi no component
public class Menu {
    @Autowired
    private List<Product> products;

    //metodo per la stampa di tutti i prodotti del menu
}
