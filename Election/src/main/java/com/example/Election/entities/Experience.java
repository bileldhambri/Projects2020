package com.example.Election.entities;

import lombok.Data;

import javax.persistence.*;
import java.text.DateFormat;
import java.time.DateTimeException;
import java.util.Date;

@Data
@Entity
public class Experience {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    private String position;
    private String lieu;
    private Date dated;

    public Date getDated() {
        return dated;
    }

    public void setDated(Date dated) {
        this.dated = dated;
    }

    public Date getDatef() {
        return datef;
    }

    public void setDatef(Date datef) {
        this.datef = datef;
    }

    private Date datef;
    @ManyToOne
    @JoinColumn(name = "candidat_id")
    private Candidat candidat_fr;
}
