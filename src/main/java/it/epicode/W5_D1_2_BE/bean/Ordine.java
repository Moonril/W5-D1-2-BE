package it.epicode.W5_D1_2_BE.bean;

import it.epicode.W5_D1_2_BE.enums.StatoOrdine;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Ordine {
    @Id
    @GeneratedValue
    private int id;
    //deve essere colegato al tavolo e ai prodotti
    private int numeroOrdine;
    private LocalTime oraOrdine;
    private int numCoperti;
    @Enumerated(EnumType.STRING)
    private StatoOrdine statoOrdine;

    @OneToMany(mappedBy = "ordine")
    private List<Product> prodotti;

    @ManyToOne
    @JoinColumn(name = "table_id")
    private Table table;

    // clacolare importo totale, compresi costo prodotti + costo coperti
    public double totaleOrdine(){
        return numCoperti*table.getCostoCoperto() +prodotti.stream().mapToDouble(Product::getPrice).sum();
    }
}
