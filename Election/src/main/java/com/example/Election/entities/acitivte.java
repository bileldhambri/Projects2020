package com.example.Election.entities;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class acitivte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idACT;
    @NonNull
    private String nomACT;
    private int noteACT;
    private Date Duree;
    private String typeACT;

   @ManyToOne
    @JoinColumn(name="Candidat_id")
    private Candidat candidat;

    @OneToMany(mappedBy = "leur_activite",cascade = CascadeType.ALL)
    private Set<Support> Supports=new HashSet<>();



}
