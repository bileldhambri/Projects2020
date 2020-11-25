package com.example.Election.repositories;

import com.example.Election.entities.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatRepository extends JpaRepository<Candidat,Long> {
    Candidat findByName(String nom);



    //cretate connection...
    //request=insert into Competition .....
}
