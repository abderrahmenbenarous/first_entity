package tn.esprit.first_entity.services;

import tn.esprit.first_entity.entities.Bloc;
import tn.esprit.first_entity.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer ajouterFoyer(Foyer foyer);
    Foyer supprimerFoyer(Foyer foyer);
    Foyer chercherFoyerParId(long id);
     void supprimerFoyerParId(long id);
    List<Foyer> afficherTout();
    List<Foyer> ajouterFoyers(List<Foyer> foyers);
    Foyer modifierFoyer(Foyer foyer);

    Foyer modifierNomFoyer(String nom ,long id);
    Foyer affecterFoyerABloc(String nomFoyer, Bloc bloc);

    Foyer ajouterFoyerEtAffecterABlocs(Foyer foyer);
}
