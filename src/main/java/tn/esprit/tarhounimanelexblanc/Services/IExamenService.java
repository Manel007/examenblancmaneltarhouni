package tn.esprit.tarhounimanelexblanc.Services;

import tn.esprit.tarhounimanelexblanc.DAO.Entities.Reservation;
import tn.esprit.tarhounimanelexblanc.DAO.Entities.Vol;
import tn.esprit.tarhounimanelexblanc.DAO.Entities.Voyageur;

import java.util.List;

public interface IExamenService {


    String ajouterVolEtAeroport(Vol vol);

   List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs);

  // Reservation confirmerReservation(String resId);
}
