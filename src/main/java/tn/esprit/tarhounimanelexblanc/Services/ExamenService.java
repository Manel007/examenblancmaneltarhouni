package tn.esprit.tarhounimanelexblanc.Services;

import tn.esprit.tarhounimanelexblanc.DAO.Entities.EtatReservation;
import tn.esprit.tarhounimanelexblanc.DAO.Entities.Reservation;
import tn.esprit.tarhounimanelexblanc.DAO.Entities.Vol;
import tn.esprit.tarhounimanelexblanc.DAO.Entities.Voyageur;
import tn.esprit.tarhounimanelexblanc.DAO.Repositories.ReservationRepository;
import tn.esprit.tarhounimanelexblanc.DAO.Repositories.VolRepository;
import tn.esprit.tarhounimanelexblanc.DAO.Repositories.VoyageurRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class ExamenService implements IExamenService {
    VolRepository volRepository;
VoyageurRepository voyageurRepository;
ReservationRepository reservationRepository;
    @Override
    public String ajouterVolEtAeroport(Vol vol) {
        return null;
    }

    @Override
    public List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs) {
        return voyageurRepository.saveAll(voyageurs);
    }

   // @Override
   // public Reservation confirmerReservation(String resId) {
      //  Reservation reservation=reservationRepository.findByidReservation(resId);

        //  reservation.setEtatReservation(reservation.getEtatReservation()).equals(EtatReservation.CONFIRMEE);
     //  return reservation;

  //  }
}
