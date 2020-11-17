package com.example.Election.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Getter
@Setter
@Entity
@Data
@DiscriminatorValue("candidat")
public class Candidat extends Personne {

    private int Pos;
    private String Nom_partie;
    private int score;
    @ManyToOne
    @JoinColumn(name="Candidat_id")
    private Liste_Candidat liste_candidat;

    @OneToMany(mappedBy ="liste_avis_candidat",cascade = CascadeType.ALL)
    List<Avis> listAvis ;

    @OneToMany(mappedBy = "liste_candidats",cascade = CascadeType.ALL)
    private Set<acitivte> activites=new HashSet<>();

}
