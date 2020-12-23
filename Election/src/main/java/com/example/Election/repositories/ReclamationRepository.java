package com.example.Election.repositories;

import com.example.Election.entities.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamationRepository extends JpaRepository<Reclamation,Long> {

    //cretate connection...
    //request=insert into Competition .....
}
