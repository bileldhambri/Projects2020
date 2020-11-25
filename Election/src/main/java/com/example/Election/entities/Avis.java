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
    private int id;
    @NonNull
    private String note;
    @ManyToOne
    @JoinColumn(name = "candidat_id")
    private Candidat candidat_id;
    @ManyToOne
    @JoinColumn(name = "electeur_id")
    private Candidat electeur_id;

}
