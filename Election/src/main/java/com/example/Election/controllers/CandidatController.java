package com.example.Election.controllers;

import com.example.Election.entities.Candidat;
import com.example.Election.repositories.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CandidatController {

    @Autowired
    private CandidatRepository r;

    @PostMapping("/addcandidat")
    public Candidat addCandidat(@RequestBody Candidat candidat) {
        return r.save(candidat);
    }

    @PostMapping("/addcandidats")
    public List<Candidat> addCandidats(@RequestBody List<Candidat> candidat) {
        return r.saveAll(candidat);
    }

    @GetMapping("/candidats")
    public List<Candidat> findAllCandidats() {
        return r.findAll();
    }

    @GetMapping("/candidatById/{id}")
    public Optional<Candidat> findCandidatById(@PathVariable long id) {
        return r.findById(id);
    }

    @GetMapping("/candidatByName/{nom}")
    public Candidat findCandidatByName(@PathVariable String nom) {
        return r.findByName(nom);
    }
    @PutMapping("/updateCandidat")
    public Candidat updateCandidat(@RequestBody Candidat candidat) {
        Candidat c = r.findById((long) candidat.getId()).orElse(null);
        c.setName(candidat.getName());
        c.setPrenom(candidat.getPrenom());
        c.setDatenais(candidat.getDatenais());
        c.setImages(candidat.getImages());
        c.setFb_link(candidat.getFb_link());
        c.setPos(candidat.getPos());
        c.setNom_partie(candidat.getNom_partie());
        c.setScore(candidat.getScore());
        return r.save(c);
    }

    @DeleteMapping("/deleteCandidat/{id}")
    public String deleteCandidat(@PathVariable Long id) {
         r.deleteById( id);
         return "Candidat removed !! " + id;
    }
}
