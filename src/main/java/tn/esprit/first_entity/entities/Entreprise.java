package tn.esprit.first_entity.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Entreprise {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEntreprise;
    @OneToMany(mappedBy = "entreprise")
    Set<Equipe> equipeSet;
}
