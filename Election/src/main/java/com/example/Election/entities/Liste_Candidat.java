package com.example.Election.entities;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

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
    @OneToMany(mappedBy = "liste_candidat",cascade=CascadeType.ALL)
    private Collection<Candidat> liste_candidat;





}
