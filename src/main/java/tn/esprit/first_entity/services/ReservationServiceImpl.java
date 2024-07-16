package tn.esprit.first_entity.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.first_entity.entities.Bloc;
import tn.esprit.first_entity.repositories.BlocRepo;

@Service
@AllArgsConstructor
public class ReservationServiceImpl {
    BlocRepo blocRepo;
    String generateNumRes(long idBloc, long cinEtudiant){
        //numRes=numChambre+nomBloc+anneUniv
       Bloc bloc=blocRepo.findById(idBloc).orElse(null);
      // bloc.getChambres()
        return null;
    }
}
