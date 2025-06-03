package it.epicode.W5_D1_2_BE.bean;

import it.epicode.W5_D1_2_BE.enums.StatoTavolo;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Table {
    private int numero;
    private int numeroMaxCoperti;
    private StatoTavolo statoTavolo;
    private double costoCoperto;
}
