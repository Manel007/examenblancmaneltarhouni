package tn.esprit.tarhounimanelexblanc.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reservation implements Serializable {

    @Id

    private String idReservation;
    @Column(unique = true)
    private Date dateReservation;

    @Column(unique = true)
    private ClassPlace classePlace;

    @Column(unique = true)
    private EtatReservation etatReservation;



    @ManyToOne
    Voyageur voyageur;
}
