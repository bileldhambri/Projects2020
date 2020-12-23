package com.example.Election.controllers;

import com.example.Election.entities.Activité;
import com.example.Election.entities.admin;
import com.example.Election.repositories.ActiviteRepository;
import com.example.Election.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.PasswordView;
import java.util.List;
import java.util.Optional;

@RestController
public class AdminController {
    @Autowired
    private AdminRepository r;

    @PostMapping("/addAdmin")
    public admin addAdmin(@RequestBody admin a) {
        return r.save(a);
    }

    @GetMapping("/AdminById/{Login}")
    public Optional<admin> findByIdAdmin(@PathVariable String Login) {
        return r.findById(Long.valueOf(Login));
    }





    @PutMapping("/updateAdmin")
    public admin updateAdmin(@RequestBody admin a) {
        admin c = r.findById(Long.valueOf(a.getLogin())).orElse(null);
        c.setNom(a.getNom());
        c.setPrenom(a.getPrenom());
        c.setPassword(a.getPassword());
        return r.save(c);
    }

    @DeleteMapping("/deleteAdmin/{id}")
    public String deleteAdmin(@PathVariable int id) {
        r.deleteById((long) id);
        return "Admin removed !! " + id;
    }
}
