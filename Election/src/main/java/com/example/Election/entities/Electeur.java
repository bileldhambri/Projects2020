package com.example.Election.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;


@Entity
@Data
@DiscriminatorValue("Electeur")
@Table(name="Electeur")
public class Electeur  extends Personne {

    @OneToMany(mappedBy = "electeur_id",cascade=CascadeType.ALL)
    private Collection<Avis> liste_avis;

}