package com.example.Election.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

abstract class  Personne implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter protected int id;
    @Getter @Setter protected String nom;
    @Getter @Setter protected String prenom ;
    @Getter @Setter protected Date datenais;
    @Getter @Setter protected byte[] images;
    @Getter @Setter protected String Fb_link;
    @Getter @Setter protected String twt_link;

}
