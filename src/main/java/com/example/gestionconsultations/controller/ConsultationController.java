package com.example.gestionconsultations.controller;

import com.example.gestionconsultations.model.Consultation;
import com.example.gestionconsultations.model.Patient;
import com.example.gestionconsultations.repository.ConsultationRepository;
import com.example.gestionconsultations.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequestMapping("/consultations")
public class ConsultationController {

    @Autowired
    private ConsultationRepository consultationRepository;

    @Autowired
    private PatientRepository patientRepository;

    // List all consultations
    @GetMapping
    public String listConsultations(Model model) {
        List<Consultation> consultations = consultationRepository.findAll();
        model.addAttribute("consultations", consultations);
        return "consultations/listConsultations";
    }

    // Show Consultation Details
    @GetMapping("/show/{id}")
    public String showConsultation(@PathVariable Long id, Model model) {
        Consultation consultation = consultationRepository.findById(id).orElse(null);
        if (consultation == null) return "redirect:/consultations";
        model.addAttribute("consultation", consultation);
        return "consultations/consultationDetails";
    }

    // Show Consultation Creation Form
    @GetMapping("/new")
    public String showConsultationForm(@RequestParam(value = "patientId", required = false) Long patientId, Model model) {
        Consultation consultation = new Consultation();
        List<Patient> patients = patientRepository.findAll();
        model.addAttribute("consultation", consultation);
        model.addAttribute("patients", patients);

        if (patientId != null) {
            Patient preselectedPatient = patientRepository.findById(patientId).orElse(null);
            if (preselectedPatient != null) {
                consultation.setPatient(preselectedPatient); // Set preselected patient in the consultation object
            }
        }

        return "consultations/formConsultation";
    }


    // Edit Consultation Form
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Consultation consultation = consultationRepository.findById(id).orElse(null);
        if (consultation == null) return "redirect:/consultations";
    
        List<Patient> patients = patientRepository.findAll();
        model.addAttribute("consultation", consultation);
        model.addAttribute("patients", patients);
   
    
        // Format the date correctly
        if (consultation.getDateConsultation() != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
            String formattedDate = consultation.getDateConsultation().format(formatter);
  
            model.addAttribute("formattedDate", formattedDate);
        } else {
            System.out.println("Date is NULL!");
        }
    
        return "consultations/formConsultation";
    }
    
    // Save Consultation (Create or Update)
    @PostMapping("/save")
    public String saveConsultation(@ModelAttribute Consultation consultation) {
        consultationRepository.save(consultation);
        return "redirect:/consultations";
    }

    // Delete a Consultation
    @GetMapping("/delete/{id}")
    public String deleteConsultation(@PathVariable Long id) {
        consultationRepository.deleteById(id);
        return "redirect:/consultations";
    }
}

