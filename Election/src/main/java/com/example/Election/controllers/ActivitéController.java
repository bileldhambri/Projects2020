package com.example.Election.controllers;

import com.example.Election.entities.Activité;
import com.example.Election.repositories.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ActivitéController {
    @Autowired
    private ActiviteRepository r;

    @PostMapping("/addactivité")
    public Activité addActivité(@RequestBody Activité activité) {
        return r.save(activité);
    }

    @PostMapping("/addactivités")
    public List<Activité> addActivité(@RequestBody List<Activité> activité) {
        return r.saveAll(activité);
    }

    @GetMapping("/Activités")
    public List<Activité> findAllActivité() {
        return r.findAll();
    }

    @GetMapping("/ActivitéById/{id}")
    public Optional<Activité> findByIdActivité(@PathVariable long id) {
        return r.findById(id);
    }

   /* @GetMapping("/ActivitéByName/{nom}")
    public Activité findActivitéByName(@PathVariable String nom) {
        return r.findByName(nom);
    }*/
    @PutMapping("/updateActivité")
    public Activité updateActivité(@RequestBody Activité activité) {
        Activité c = r.findById((long) activité.getIdACT()).orElse(null);
        c.setNomACT(activité.getNomACT());
        c.setDuree(activité.getDuree());
        c.setNoteACT(activité.getNoteACT());
        c.setTypeACT(activité.getTypeACT());
        return r.save(c);
    }

    @DeleteMapping("/deleteActivité/{id}")
    public String deleteAcitivité(@PathVariable int id) {
        r.deleteById((long) id);
        return "Avis removed !! " + id;
    }
}
