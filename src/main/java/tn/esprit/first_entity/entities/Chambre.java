package tn.esprit.first_entity.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idChambre;
    long numchambre;
    @OneToMany
    Set<Reservation> reservations;
    @ManyToOne
    Bloc bloc;
}
