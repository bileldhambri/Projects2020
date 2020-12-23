package com.example.Election.repositories;

import com.example.Election.entities.admin;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<admin,Long> {
    Optional<admin> findByLogin(String Login);

    //cretate connection...
    //request=insert into Competition .....
}
