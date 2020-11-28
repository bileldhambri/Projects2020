package com.example.Election.entities;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
public class Activité {
    public int getIdACT() {
        return idACT;
    }

    public void setIdACT(int idACT) {
        this.idACT = idACT;
    }

    public String getNomACT() {
        return nomACT;
    }

    public void setNomACT(String nomACT) {
        this.nomACT = nomACT;
    }

    public int getNoteACT() {
        return noteACT;
    }

    public void setNoteACT(int noteACT) {
        this.noteACT = noteACT;
    }

    public Date getDuree() {
        return Duree;
    }

    public void setDuree(Date duree) {
        Duree = duree;
    }

    public String getTypeACT() {
        return typeACT;
    }

    public void setTypeACT(String typeACT) {
        this.typeACT = typeACT;
    }

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
