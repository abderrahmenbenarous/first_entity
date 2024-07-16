package tn.esprit.first_entity.restController;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.first_entity.entities.Bloc;
import tn.esprit.first_entity.entities.Foyer;
import tn.esprit.first_entity.services.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer-rest-controller")
public class FoyerRestController {
    IFoyerService foyerService;
    @PostMapping(path = "/foyer")
    Foyer ajouterFoyer(@RequestBody Foyer foyer){
        return foyerService.ajouterFoyer(foyer);
    }
    @DeleteMapping("/foyer")
    Foyer supprimerFoyer(@RequestBody Foyer foyer){
        return foyerService.supprimerFoyer(foyer);
    }
    @GetMapping("/foyer/{id-foyer}")
    Foyer chercherFoyerParId(@PathVariable("id-foyer") long id){
        return foyerService.chercherFoyerParId(id);
    }
    @DeleteMapping("/foyer/{id-foyer}")
    void supprimerFoyerParId(@PathVariable("id-foyer") long id){
        foyerService.supprimerFoyerParId(id);
    }
    @GetMapping("/foyers")
    List<Foyer> afficherTout(){
        return foyerService.afficherTout();
    }
    @PostMapping("/foyers")
    List<Foyer> ajouterFoyers(@RequestBody List<Foyer> foyers){
        return foyerService.ajouterFoyers(foyers);
    }
    @PutMapping("/foyer")
    Foyer modifierFoyer(@RequestBody Foyer foyer){
        return foyerService.modifierFoyer(foyer);
    }
    @PutMapping("/foyer/{id-foyer}/{nom}")
    Foyer modifierNomFoyer(@PathVariable("nom") String nom ,@PathVariable("id-foyer") long id){
        return foyerService.modifierNomFoyer(nom, id);
    }
    @PostMapping(path = "/foyer-bloc/{nom-foyer}")
    public Foyer affecterFoyerABloc(@PathVariable("nom-foyer") String nomFoyer,@RequestBody Bloc bloc){
        return foyerService.affecterFoyerABloc(nomFoyer, bloc);
    }
    @PostMapping("/foyer-blocs")
    Foyer ajouterFoyerEtAffecterABlocs(@RequestBody Foyer foyer){
        return foyerService.ajouterFoyerEtAffecterABlocs(foyer);
    }
}
