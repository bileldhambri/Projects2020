package com.example.Election.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@DiscriminatorValue("Candidat")
@Table(name="Candidat")
public class Candidat extends Personne {

    public int getPos() {
        return Pos;
    }

    public void setPos(int pos) {
        Pos = pos;
    }

    public String getNom_partie() {
        return Nom_partie;
    }

    public void setNom_partie(String nom_partie) {
        Nom_partie = nom_partie;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private int Pos;
    private String Nom_partie;
    private int score;
@ManyToOne
@JoinColumn(name="liste_id")
    private Liste_Candidat liste_candidat;
@OneToMany(mappedBy = "candidat",cascade=CascadeType.ALL)
    private Collection<Activité> Activités;
    @OneToMany(mappedBy = "candidat_id",cascade=CascadeType.ALL)
    private Collection<Avis> liste_avis;

}