package com.example.Election.controllers;

import com.example.Election.entities.Avis;
import com.example.Election.repositories.AvisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AvisController {
    @Autowired
    private AvisRepository r;

    @PostMapping("/add1Avis")
    public Avis addAvis(@RequestBody Avis avis) {
        return r.save(avis);
    }

    @PostMapping("/add+Avis")
    public List<Avis> addAvis(@RequestBody List<Avis> avis) {
        return r.saveAll(avis);
    }

    @GetMapping("/Avis")
    public List<Avis> findAllAvis() {
        return r.findAll();
    }

    @GetMapping("/AvisById/{id}")
    public Optional<Avis> findAvisById(@PathVariable long id) {
        return r.findById(id);
    }

   /*@GetMapping("/AvisByName/{nom}")
    public Avis findAvisByName(@PathVariable String nom) {
        return r.findByName(nom);
    }*
    */
    @PutMapping("/updateAvis")
    public Avis updateAvis(@RequestBody Avis avis) {
        Avis c = r.findById((long) avis.getId()).orElse(null);
        c.setNote(avis.getNote());
        return r.save(c);
    }

    @DeleteMapping("/deleteAvis/{id}")
    public String deleteAvis(@PathVariable int id) {
        r.deleteById((long) id);
        return "Avis removed !! " + id;
    }
}
