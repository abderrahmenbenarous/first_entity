package tn.esprit.first_entity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.first_entity.entities.Foyer;

@Repository
public interface FoyerRepo extends JpaRepository<Foyer,Long> {

    Foyer findByNomFoyerAndBlocsIdBloc(String nomFoyer,long idBlocB);
    @Query(value = "select foyer from Foyer foyer where foyer.nomFoyer=:nom")
    Foyer chercherParNomFoyer(@Param("nom") String nomFoyer);
    Foyer findFoyerByNomFoyer(String nom);
    @Query("select foyer from Foyer foyer join foyer.blocs bloc where foyer.nomFoyer=:nom and bloc.idBloc=:id")
    Foyer chercherFoyerParNomEtIdBloc(@Param("nom") String nomF,@Param("id") long idBloc);
}
