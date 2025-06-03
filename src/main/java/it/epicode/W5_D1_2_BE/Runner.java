package it.epicode.W5_D1_2_BE;

import it.epicode.W5_D1_2_BE.bean.*;
import it.epicode.W5_D1_2_BE.enums.StatoOrdine;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;

@Component
@Order(1)
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(W5D12BeApplication.class);

        Menu menu = ctx.getBean(Menu.class);
        menu.stampaManu();

        Ordine o1 = new Ordine();
        o1.setNumeroOrdine(1);
        o1.setNumCoperti(4);
        o1.setOraOrdine(LocalTime.of(21, 0, 0));
        o1.setStatoOrdine(StatoOrdine.IN_CORSO);
        o1.setTable(ctx.getBean("t1", Table.class));
        o1.setProdotti(List.of(ctx.getBean("water", Drink.class), ctx.getBean("lemonade", Drink.class), ctx.getBean("pizza margherita", Pizza.class), ctx.getBean("pizza diavola", Pizza.class)));

        System.out.println(o1);

        System.out.println(o1.totaleOrdine());
    }
}
