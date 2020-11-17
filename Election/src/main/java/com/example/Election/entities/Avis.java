package com.example.Election.entities;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Getter
@Setter
@Entity
@Data
public class Avis implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @NonNull
    String note;
    @ManyToOne
    @JoinColumn(name="id_Candidat")
    private Candidat liste_avis_candidat;

    @ManyToOne
    @JoinColumn(name="id_Candidat")
    private Electeur liste_avis_electeur;



}
