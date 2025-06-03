package it.epicode.W5_D1_2_BE.bean;

import it.epicode.W5_D1_2_BE.enums.StatoOrdine;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@NoArgsConstructor
public class Ordine {
    //deve essere colegato al tavolo e ai prodotti
    private int numeroOrdine;
    private LocalTime oraOrdine;
    private int numCoperti;
    private StatoOrdine statoOrdine;
    private Table table;
    private List<Product> prodotti;

    // clacolare importo totale, compresi costo prodotti + costo coperti
    public double totaleOrdine(){
        return numCoperti*table.getCostoCoperto() +prodotti.stream().mapToDouble(Product::getPrice).sum();
    }
}
