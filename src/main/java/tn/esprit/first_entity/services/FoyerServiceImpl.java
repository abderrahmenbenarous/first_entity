package tn.esprit.first_entity.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.first_entity.entities.Bloc;
import tn.esprit.first_entity.entities.Foyer;
import tn.esprit.first_entity.repositories.BlocRepo;
import tn.esprit.first_entity.repositories.FoyerRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService{
FoyerRepo foyerRepo;
BlocRepo blocRepo;
    @Override
    public Foyer supprimerFoyer(Foyer foyer) {
         foyerRepo.delete(foyer);
         return foyerRepo.findById(foyer.getIdFoyer()).orElse(null);
    }

    @Override
    public Foyer chercherFoyerParId(long id) {
        return foyerRepo.findById(id).orElse(null);
    }

    @Override
    public void supprimerFoyerParId(long id) {
        foyerRepo.deleteById(id);
    }

    @Override
    public List<Foyer> afficherTout() {
        return foyerRepo.findAll();
    }

    @Override
    public List<Foyer> ajouterFoyers(List<Foyer> foyers) {
        return foyerRepo.saveAll(foyers);
    }

    @Override
    public Foyer modifierFoyer(Foyer foyer) {
        return foyerRepo.save(foyer);
    }

    @Override
    public Foyer modifierNomFoyer(String nom, long id) {
        Foyer foyer=foyerRepo.findById(id).orElse(null);
        if(foyer !=null)
            foyer.setNomFoyer(nom);
        return foyerRepo.save(foyer);
    }

    @Override
    public Foyer affecterFoyerABloc(String nomFoyer, Bloc bloc) {
        //1ere etape recuperation
        Foyer foyer=foyerRepo.findFoyerByNomFoyer(nomFoyer);
        //2eme etape affectation suivant la regle parent.setFils

        bloc.setFoyer(foyer);
        //enregistrer
        blocRepo.save(bloc);
        return foyerRepo.findFoyerByNomFoyer(nomFoyer);
    }

    @Override
    public Foyer ajouterFoyerEtAffecterABlocs(Foyer foyer) {
        for(Bloc bloc:foyer.getBlocs()) {
            bloc.setFoyer(foyer);

        }
        return foyerRepo.save(foyer);
    }

    @Override
    public Foyer ajouterFoyer(Foyer foyer) {
        //parent.setFils()

        return foyerRepo.save(foyer);
    }

}
