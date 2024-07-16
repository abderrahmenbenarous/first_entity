package tn.esprit.first_entity.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Salle {
    @Id
    Long id;
    @ManyToOne
    Cinema cinema;
}
