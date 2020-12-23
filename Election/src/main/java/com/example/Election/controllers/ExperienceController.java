
package com.example.Election.controllers;

        import com.example.Election.entities.Experience;
        import com.example.Election.entities.Formation;
        import com.example.Election.repositories.ExperienceRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;
        import java.util.Optional;

@RestController
public class ExperienceController {
    @Autowired
    private ExperienceRepository r;

    @PostMapping("/addExperience")
    public Experience addExpereince(@RequestBody Experience experience) {
        return r.save(experience);
    }

    @PostMapping("/addExperiences")
    public List<Experience> addExperiences(@RequestBody List<Experience> Experiences) {
        return r.saveAll(Experiences);
    }

    @GetMapping("/Experiences")
    public List<Experience> findAllExperiences() {
        return r.findAll();
    }

    @GetMapping("/ExperienceById/{id}")
    public Optional<Experience> findExperienceById(@PathVariable int id) {
        return r.findById((long) id);
    }


    @PutMapping("/updateExperience")
    public Experience updateExperience(@RequestBody Experience experience) {
        Experience c = r.findById((long) experience.getId()).orElse(null);
        c.setLieu(c.getLieu());
        c.setPosition(c.getPosition());
        c.setDated(c.getDated());
        c.setDatef(c.getDatef());
        return r.save(c);
    }

    @DeleteMapping("/deleteExperience/{id}")
    public String deleteExperience(@PathVariable int id) {
        r.deleteById((long) id);
        return "Experience removed !! " + id;
    }
}
