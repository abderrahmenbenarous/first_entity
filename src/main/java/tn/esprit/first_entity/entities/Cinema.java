package tn.esprit.first_entity.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Cinema {
    @Id
    Long id;
    @OneToMany(mappedBy = "cinema")
    Set<Salle> salles;
}
