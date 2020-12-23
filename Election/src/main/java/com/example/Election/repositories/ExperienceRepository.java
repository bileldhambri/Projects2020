package com.example.Election.repositories;

import com.example.Election.entities.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience,Long> {

    //cretate connection...
    //request=insert into Competition .....
}
