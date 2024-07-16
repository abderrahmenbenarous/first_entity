package tn.esprit.first_entity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.first_entity.entities.Bloc;

@Repository
public interface BlocRepo extends JpaRepository<Bloc,Long> {
   // Bloc findByDateAfter()
}
