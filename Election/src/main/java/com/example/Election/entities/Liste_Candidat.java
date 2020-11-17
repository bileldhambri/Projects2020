package com.example.Election.entities;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;

@Getter
@Setter
@Entity
@Data
public class Liste_Candidat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;
    @NonNull
    String nomListe;
    String type;
    int scoreTotale;

    @OneToMany(mappedBy = "liste_candidat")
    HashSet<Candidat> list = new HashSet<>();




}
