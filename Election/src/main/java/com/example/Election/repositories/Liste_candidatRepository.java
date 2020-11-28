package com.example.Election.repositories;

import com.example.Election.entities.Liste_Candidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Liste_candidatRepository extends JpaRepository<Liste_Candidat,Long> {
    Liste_Candidat findBynomListe(String nomListe);

    //cretate connection...
    //request=insert into Competition .....
}
