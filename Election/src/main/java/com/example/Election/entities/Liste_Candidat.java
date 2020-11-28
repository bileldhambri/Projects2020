package com.example.Election.entities;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Getter
@Setter
@Entity
@Data
public class Liste_Candidat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @NonNull
    private String nomListe;
    private int scoreTotale;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomListe() {
        return nomListe;
    }

    public void setNomListe(String nomListe) {
        this.nomListe = nomListe;
    }

    public int getScoreTotale() {
        return scoreTotale;
    }

    public void setScoreTotale(int scoreTotale) {
        this.scoreTotale = scoreTotale;
    }

    @OneToMany(mappedBy = "liste_candidat",cascade=CascadeType.ALL)
    private Collection<Candidat> liste_candidat;





}
