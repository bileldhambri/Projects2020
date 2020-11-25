package com.example.Election.entities;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Activité {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idACT;
    @NonNull
    private String nomACT;
    private int noteACT;
    private Date Duree;
    private String typeACT;
@ManyToOne
@JoinColumn(name = "candidat_id")
    private Candidat candidat;
@OneToMany(mappedBy = "activité",cascade = CascadeType.ALL)
private Collection<Support> Supports;



}
