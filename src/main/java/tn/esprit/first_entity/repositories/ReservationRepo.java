package tn.esprit.first_entity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.first_entity.entities.Reservation;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation,Long> {
}
