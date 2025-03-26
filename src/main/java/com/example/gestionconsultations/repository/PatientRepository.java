package com.example.gestionconsultations.repository;

import com.example.gestionconsultations.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
