package com.rabobank.resume.controllers;

import com.rabobank.resume.models.WorkExperience;
import org.springframework.web.bind.annotation.*;
import com.rabobank.resume.repositories.WorkExperiencesRepository;

import java.util.List;

@RestController
@RequestMapping("api/work-experiences")
public class WorkExperienceController {
    private final WorkExperiencesRepository workExperiencesRepository;


    //Add a constructor here
    public WorkExperienceController(WorkExperiencesRepository workExperiencesRepository) {
        this.workExperiencesRepository = workExperiencesRepository;
    }

    // CRUD - Create / Read / Update / Delete

    @GetMapping //Read
    public List<WorkExperience> getAll() {
        return workExperiencesRepository.findAll();
    }

    @PostMapping //Create
    public WorkExperience create(@RequestBody WorkExperience workExperience) throws Exception {
        if (workExperience.getId() != null) {
            throw new Exception();
        }

        return workExperiencesRepository.save(workExperience);
    }

    @PutMapping //Update
    public WorkExperience update(@RequestBody WorkExperience workExperience) throws Exception {
        if (workExperience.getId() == null) {
            throw new Exception();
        }
        return workExperiencesRepository.save(workExperience);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        workExperiencesRepository.deleteById(id);
    }

}
