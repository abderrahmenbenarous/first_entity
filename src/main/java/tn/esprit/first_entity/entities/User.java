package tn.esprit.first_entity.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
//@EqualsAndHashCode
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idUser;
    @Column(length = 8,name = "identifiant")
    String cin;
    @Transient
    String firstName;
    String lastName;

    LocalDate dateBirth;
    @Enumerated(EnumType.STRING)
    Role role;

}
