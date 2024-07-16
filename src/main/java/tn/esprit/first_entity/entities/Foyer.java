package tn.esprit.first_entity.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idFoyer;
    String nomFoyer;
    int capacite;
    @OneToOne(mappedBy = "foyer")
            @ToString.Exclude
            @JsonIgnore
    Universite universite;
    @OneToMany(mappedBy = "foyer",cascade = CascadeType.ALL)

    Set<Bloc> blocs;
}
