package com.example.Election.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Data
@DiscriminatorValue("electeur")
public class Electeur  extends Personne implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(mappedBy ="liste_avis_electeur",cascade = CascadeType.ALL)
    List<Avis> listAvis ;
}
