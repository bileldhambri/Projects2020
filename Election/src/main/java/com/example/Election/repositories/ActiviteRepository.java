package com.example.Election.repositories;

import com.example.Election.entities.Activité;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiviteRepository extends JpaRepository<Activité,Long> {

    //cretate connection...
    //request=insert into Competition .....
}
