package com.example.Election.entities;

import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;

@Entity
public class acitivte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idACT;
    @NonNull
    private String nomACT;
    private int noteACT;
    private Date Duree;
    private String typeACT;
    /*@ManyToOne
    private Candidat leur_candidat;*/



}
