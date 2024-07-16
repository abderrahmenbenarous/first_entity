package tn.esprit.first_entity.entities;

import jakarta.persistence.*;

@Entity
public class Equipe {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEquipe;
    String nom;
    @ManyToOne
    Entreprise entreprise;
}
