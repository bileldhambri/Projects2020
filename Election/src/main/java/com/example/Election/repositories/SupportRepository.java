package com.example.Election.repositories;

import com.example.Election.entities.Support;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupportRepository extends JpaRepository<Support,Long> {

    //cretate connection...
    //request=insert into Competition .....
}
