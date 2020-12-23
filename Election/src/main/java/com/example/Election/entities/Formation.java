package com.example.Election.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Formation {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplpme(String diplome) {
        diplome = diplome;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String diplome;

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstitut() {
        return institut;
    }

    public void setInstitut(String institut) {
        this.institut = institut;
    }

    private String description;
    private String institut;
    @ManyToOne
    @JoinColumn(name = "candidat_id")
    private Candidat candidat_fr;
}
