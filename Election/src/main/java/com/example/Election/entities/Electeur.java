package com.example.Election.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
public class Electeur  extends Personne implements Serializable {
}
