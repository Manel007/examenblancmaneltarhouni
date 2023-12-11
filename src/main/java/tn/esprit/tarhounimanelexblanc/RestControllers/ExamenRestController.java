package tn.esprit.tarhounimanelexblanc.RestControllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.tarhounimanelexblanc.DAO.Entities.Voyageur;
import tn.esprit.tarhounimanelexblanc.Services.IExamenService;
import tn.esprit.tarhounimanelexblanc.Services.*;
import java.util.List;

@RestController
@AllArgsConstructor
public class ExamenRestController {
    IExamenService IExamenService;

    @PostMapping("/ajouterVoyageurs")
  List<Voyageur> ajouterVoyageurs(@RequestBody List<Voyageur> voyageurs) {
        return IExamenService.ajouterVoyageurs(voyageurs);
    }
}
