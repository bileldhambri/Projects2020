package com.example.Election.controllers;

import com.example.Election.entities.Liste_Candidat;
import com.example.Election.repositories.Liste_candidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Liste_CandidatController {
    @Autowired
    private Liste_candidatRepository r;

    @PostMapping("/addListe_candidat")
    public Liste_Candidat addListe_Candidat(@RequestBody Liste_Candidat liste_Candidat) {
        return r.save(liste_Candidat);
    }

    @PostMapping("/addListe_candidats")
    public List<Liste_Candidat> addListe_Candidat(@RequestBody List<Liste_Candidat> liste_Candidat) {
        return r.saveAll(liste_Candidat);
    }

    @GetMapping("/Liste_candidats")
    public List<Liste_Candidat> findAllListe_Candidat() {
        return r.findAll();
    }

    @GetMapping("/Liste_candidatById/{id}")
    public Optional<Liste_Candidat> findListe_CandidatById(@PathVariable int id) {
        return r.findById((long) id);
    }

    @GetMapping("/Liste_candidatByName/{nom}")
    public Liste_Candidat findListe_CandidatBynomListe(@PathVariable String nomListe) {
        return r.findBynomListe(nomListe);
    }

    @PutMapping("/updateListe_candidat")
    public Liste_Candidat updateListe_Candidat(@RequestBody Liste_Candidat liste_Candidat) {
        Liste_Candidat c = r.findById((long) liste_Candidat.getId()).orElse(null);
        c.setNomListe(c.getNomListe());
        c.setScoreTotale(c.getScoreTotale());


        return r.save(c);
    }

    @DeleteMapping("/deleteListe_candidat/{id}")
    public String deleteListe_Candidat(@PathVariable int id) {
        r.deleteById((long) id);
        return "Liste_candidat removed !! " + id;
    }
}
