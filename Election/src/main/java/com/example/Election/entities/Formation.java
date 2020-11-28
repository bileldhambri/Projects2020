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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Description;
    @ManyToOne
    @JoinColumn(name = "candidat_id")
    private Candidat candidat_fr;
}
