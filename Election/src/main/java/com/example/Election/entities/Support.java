package com.example.Election.entities;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
public class Support {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idSUP;
    @NonNull
    private String nomSUP;
    @NonNull
    private String refSUP;
    @ManyToOne
    @JoinColumn(name="activité_id")
    private Activité activité;


}
