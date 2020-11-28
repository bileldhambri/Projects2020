package com.example.Election.repositories;

import com.example.Election.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationRepository extends JpaRepository<Formation,Long> {

    //cretate connection...
    //request=insert into Competition .....
}
