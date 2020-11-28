package com.example.Election.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Personne")


abstract class  Personne implements Serializable {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
protected long id;
protected   String name;
protected String prenom ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDatenais() {
        return datenais;
    }

    public void setDatenais(Date datenais) {
        this.datenais = datenais;
    }

    public byte[] getImages() {
        return images;
    }

    public void setImages(byte[] images) {
        this.images = images;
    }

    public String getFb_link() {
        return Fb_link;
    }

    public void setFb_link(String fb_link) {
        Fb_link = fb_link;
    }

    public String getTwt_link() {
        return twt_link;
    }

    public void setTwt_link(String twt_link) {
        this.twt_link = twt_link;
    }

    protected Date datenais;
protected byte[] images;
protected String Fb_link;
protected String twt_link;

}
