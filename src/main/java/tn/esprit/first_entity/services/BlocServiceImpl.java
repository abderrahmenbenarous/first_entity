package tn.esprit.first_entity.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.first_entity.entities.Bloc;
import tn.esprit.first_entity.repositories.BlocRepo;

@Service
@AllArgsConstructor
@Slf4j
public class BlocServiceImpl implements IBlocService{
    BlocRepo blocRepo;

    @Override
    public Bloc ajouterBlocEtFoyerParCascade(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public Bloc desaffecterBlocAFoyer(long idBloc) {
        //desaffecter parent.setFils(null)
        Bloc bloc=blocRepo.findById(idBloc).orElse(null);
        bloc.setFoyer(null);
        return blocRepo.save(bloc);
    }
   // @Scheduled(fixedRate=5000)//toutes les 5 secondes
  //  @Scheduled(fixedDelay = 5000)//toutes les 5 secondes en tenant compte de temps d'execution
   //@Scheduled(cron = "5 * * * * *")//La 5eme seconde de chaque minute, heure, jour, mois et jour de la semaine
    @Scheduled(cron="0/15 * * * * *")//
    void recette(){
        log.info("scheduler ALINFO 3");
        for(Bloc bloc :blocRepo.findAll())
            log.info("bloc :"+bloc.getIdBloc()+" est "+bloc.toString());
    }
}
