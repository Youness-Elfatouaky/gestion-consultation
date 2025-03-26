package com.example.gestionconsultations.controller;

import com.example.gestionconsultations.model.Patient;
import com.example.gestionconsultations.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    // ✅ 1. List all patients
    @GetMapping
    public String listPatients(Model model) {
        List<Patient> patients = patientRepository.findAll();
        model.addAttribute("patients", patients);
        return "patients/listPatients"; // Template for patient list
    }

    // ✅ 2. Show patient details
    @GetMapping("/show/{id}")
    public String showPatient(@PathVariable Long id, Model model) {
        Patient patient = patientRepository.findById(id).orElse(null);
        if (patient == null) return "redirect:/patients";
        model.addAttribute("patient", patient);
        return "patients/patientDetails"; // Template for patient details
    }

    // ✅ 3. Show patient creation form
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "patients/formPatient"; // Template for creating a new patient
    }

    // ✅ 4. Save a new patient
    @PostMapping("/save")
    public String savePatient(@ModelAttribute Patient patient) {
        patientRepository.save(patient);
        return "redirect:/patients";
    }

    // ✅ 5. Edit patient
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Patient patient = patientRepository.findById(id).orElse(null);
        if (patient == null) return "redirect:/patients";
        model.addAttribute("patient", patient);
        return "patients/formPatient"; // Template for editing patient
    }

    // ✅ 6. Delete a patient
    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable Long id) {
        patientRepository.deleteById(id);
        return "redirect:/patients";
    }
}
