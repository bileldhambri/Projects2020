package com.example.Election.entities;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Data
@Entity
public class Support {
    public long getIdSUP() {
        return idSUP;
    }

    public void setIdSUP(long idSUP) {
        this.idSUP = idSUP;
    }

    public String getNomSUP() {
        return nomSUP;
    }

    public void setNomSUP(String nomSUP) {
        this.nomSUP = nomSUP;
    }

    public String getRefSUP() {
        return refSUP;
    }

    public void setRefSUP(String refSUP) {
        this.refSUP = refSUP;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idSUP;
    @NonNull
    private String nomSUP;
    @NonNull
    private String refSUP;
    @ManyToOne
    @JoinColumn(name="activité_id")
    private Activité activité;


}
