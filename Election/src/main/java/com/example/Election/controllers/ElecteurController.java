package com.example.Election.controllers;

import com.example.Election.entities.Candidat;
import com.example.Election.entities.Electeur;
import com.example.Election.repositories.ElecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ElecteurController {

    @Autowired
    private ElecteurRepository r;

    @PostMapping("/addElecteur")
    public Electeur addElecteur(@RequestBody Electeur electeur) {
        return r.save(electeur);
    }

    @PostMapping("/addElecteurs")
    public List<Electeur> addElecteurs(@RequestBody List<Electeur> Electeurs) {
        return r.saveAll(Electeurs);
    }

    @GetMapping("/electeurs")
    public List<Electeur> findAllElecteurs() {
        return r.findAll();
    }

    @GetMapping("/electeurById/{id}")
    public Optional<Electeur> findElecteurById(@PathVariable int id) {
        return r.findById((long) id);
    }

    @GetMapping("/electeurByName/{nom}")
    public Electeur findElecteurByName(@PathVariable String nom) {
        return r.findByName(nom);
    }
    @PutMapping("/updateElecteur")
    public Electeur updateElecteur(@RequestBody Electeur electeur) {
        Electeur c = r.findById((long) electeur.getId()).orElse(null);
        c.setName(electeur.getName());
        c.setPrenom(electeur.getPrenom());
        c.setDatenais(electeur.getDatenais());
        c.setImages(electeur.getImages());
        c.setFb_link(electeur.getFb_link());

        return r.save(c);
    }

    @DeleteMapping("/deleteElecteur/{id}")
    public String deleteElecteur(@PathVariable int id) {
        r.deleteById((long) id);
        return "Electeur removed !! " + id;
    }
}
