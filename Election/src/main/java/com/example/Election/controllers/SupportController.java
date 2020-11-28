package com.example.Election.controllers;

import com.example.Election.entities.Support;
import com.example.Election.repositories.SupportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SupportController {

    @Autowired
    private SupportRepository r;

    @PostMapping("/addSupport")
    public Support addSupport(@RequestBody Support support) {
        return r.save(support);
    }

    @PostMapping("/addSupports")
    public List<Support> addSupports(@RequestBody List<Support> Supports) {
        return r.saveAll(Supports);
    }

    @GetMapping("/Supports")
    public List<Support> findAllSupports() {
        return r.findAll();
    }

    @GetMapping("/SupportById/{id}")
    public Optional<Support> findSupportById(@PathVariable int id) {
        return r.findById((long) id);
    }


    /*@GetMapping("/SupportByName/{nom}")
    public Support findsSupprotByName(@PathVariable String nom) {
        return r.findByName(nom);
    }*/
    @PutMapping("/updateSupport")
    public Support updateSupport(@RequestBody Support support) {
        Support c = r.findById((long) support.getIdSUP()).orElse(null);
        c.setNomSUP(support.getNomSUP());
        c.setRefSUP(support.getRefSUP());
        return r.save(c);
    }

    @DeleteMapping("/deleteSupport/{id}")
    public String deleteSupport(@PathVariable int id) {
        r.deleteById((long) id);
        return "Support removed !! " + id;
    }
}
