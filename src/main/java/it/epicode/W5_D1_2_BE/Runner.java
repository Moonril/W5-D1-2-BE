package it.epicode.W5_D1_2_BE;


import org.springframework.boot.CommandLineRunner;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;

@Component
@Order(1)
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

    }
}
