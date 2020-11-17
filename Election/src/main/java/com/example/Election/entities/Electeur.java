package com.example.Election.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
@Entity(name = "Electeur")
@DiscriminatorValue("Electeur")
@Getter
@Setter
@Data
public class Electeur  extends Personne{

    @OneToMany(mappedBy ="liste_avis_electeur")
    ArrayList<Avis> listAvis = new ArrayList<>();
}
