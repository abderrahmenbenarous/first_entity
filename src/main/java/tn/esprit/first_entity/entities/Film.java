package tn.esprit.first_entity.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Film {
    @Id
    Long id;
}
