package tn.esprit.first_entity.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idBloc;
    String nomBloc;
    LocalDate date;
    @ManyToOne(cascade = CascadeType.ALL)
@ToString.Exclude
    Foyer foyer;
    @OneToMany(mappedBy = "bloc")
            @ToString.Exclude
    Set<Chambre> chambres;
}
