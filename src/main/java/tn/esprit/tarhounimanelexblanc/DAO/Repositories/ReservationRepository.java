package tn.esprit.tarhounimanelexblanc.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tarhounimanelexblanc.DAO.Entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
    Reservation findByidReservation(String resId);
}
