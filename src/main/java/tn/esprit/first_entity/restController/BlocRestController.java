package tn.esprit.first_entity.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.first_entity.entities.Bloc;
import tn.esprit.first_entity.services.IBlocService;

@RestController
@AllArgsConstructor
public class BlocRestController {
    IBlocService blocService;
    @PostMapping("/bloc-foyer")
    Bloc ajouterBlocEtFoyerParCascade(@RequestBody Bloc bloc){
        return blocService.ajouterBlocEtFoyerParCascade(bloc);
    }
    @PutMapping("/bloc-de-foyer/{id-bloc}")
    Bloc desaffecterBlocAFoyer(@PathVariable("id-bloc") long idBloc){
        return blocService.desaffecterBlocAFoyer(idBloc);
    }
}
