package tn.esprit.tarhounimanelexblanc.DAO.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Aeroport implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int idAeroport;
    @Column(unique = true)
    private String nom;

    @Column(unique = true)
    private String codeAITA;

    @Column(unique = true)
    private long telephone;

    @OneToMany(mappedBy="aeroport",cascade = CascadeType.ALL)
    List<Vol> vols= new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy="aeroport",cascade = CascadeType.ALL)
    List<Vol> volss= new ArrayList<>();
}
