package com.example.Election.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
@Entity
@Data
public class Candidat extends Personne implements Serializable {
    @Getter
    @Setter
    private int Pos;
    @Getter
    @Setter
    private String Nom_partie;
    @Getter
    @Setter
    private int score;
    @ManyToOne
    @JoinColumn(name="Candidat_id")
    private Liste_Candidat liste_candidat;

    @OneToMany(mappedBy ="liste_avis_candidat")
    ArrayList<Avis> listAvis = new ArrayList<Avis>();

}
