package it.epicode.W5_D1_2_BE.bean;

import it.epicode.W5_D1_2_BE.enums.StatoTavolo;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@Entity
public class Table {
    @Id
    @GeneratedValue
    private int id;
    private int numero;
    private int numeroMaxCoperti;
    @Enumerated(EnumType.STRING)
    private StatoTavolo statoTavolo;
    private double costoCoperto;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    @OneToMany(mappedBy = "table")
    private List<Ordine> ordine;
}
