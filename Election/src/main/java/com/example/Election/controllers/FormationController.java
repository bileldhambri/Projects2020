package com.example.Election.controllers;

import com.example.Election.entities.Formation;
import com.example.Election.repositories.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FormationController {
    @Autowired
    private FormationRepository r;

    @PostMapping("/addFormation")
    public Formation addFormation(@RequestBody Formation formation) {
        return r.save(formation);
    }

    @PostMapping("/addFormations")
    public List<Formation> addFormations(@RequestBody List<Formation> Formations) {
        return r.saveAll(Formations);
    }

    @GetMapping("/Formations")
    public List<Formation> findAllFormations() {
        return r.findAll();
    }

    @GetMapping("/FormationById/{id}")
    public Optional<Formation> findFormationById(@PathVariable int id) {
        return r.findById((long) id);
    }

    /*@GetMapping("/FormationByName/{nom}")
    public Formation findFormationByName(@PathVariable String nom) {
        return r.findByName(nom);
    }*/
    @PutMapping("/updateFormation")
    public Formation updateFormation(@RequestBody Formation formation) {
        Formation c = r.findById((long) formation.getId()).orElse(null);
        c.setDescription(c.getDescription());

        return r.save(c);
    }

    @DeleteMapping("/deleteFormation/{id}")
    public String deleteFormation(@PathVariable int id) {
        r.deleteById((long) id);
        return "Formation removed !! " + id;
    }
}
