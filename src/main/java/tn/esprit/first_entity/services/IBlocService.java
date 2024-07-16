package tn.esprit.first_entity.services;

import tn.esprit.first_entity.entities.Bloc;

public interface IBlocService {
    Bloc ajouterBlocEtFoyerParCascade(Bloc bloc);
    Bloc desaffecterBlocAFoyer(long idBloc);
}
