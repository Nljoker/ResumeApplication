package com.rabobank.resume.repositories;

import com.rabobank.resume.models.WorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkExperiencesRepository extends JpaRepository<WorkExperience, Long> {
    }
