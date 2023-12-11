package tn.esprit.tarhounimanelexblanc.DAO.Entities;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Voyageur implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int idVoyageur;
    @Column(unique = true)
    private String nom;

    @Column(unique = true)
    private String prenom;

    @Column(unique = true)
    private Date dateNaissance;



    @OneToMany(mappedBy = "voyageur")
    List<Reservation> reservations= new ArrayList<>();
}
