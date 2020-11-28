package com.example.Election.repositories;

import com.example.Election.entities.Electeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElecteurRepository extends JpaRepository<Electeur,Long> {
    Electeur findByName(String nom);

    //cretate connection...
    //request=insert into Competition .....
}
