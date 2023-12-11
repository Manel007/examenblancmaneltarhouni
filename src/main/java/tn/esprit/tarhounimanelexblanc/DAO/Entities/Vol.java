package tn.esprit.tarhounimanelexblanc.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Vol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVol;
    @Column(unique = true)
    private Date dateDepart;

    @Column(unique = true)
    private Date dateArrive;
    @JsonIgnore
    @ManyToOne
    Aeroport aeroport;

}