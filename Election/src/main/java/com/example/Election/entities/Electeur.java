package com.example.Election.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Entity
@Data
@DiscriminatorValue("Electeur")
@Table(name="Electeur")
public class Electeur  extends Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(mappedBy = "electeur_id",cascade=CascadeType.ALL)
    private Collection<Avis> liste_avis;

}