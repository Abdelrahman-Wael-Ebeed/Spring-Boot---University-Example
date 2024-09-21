package com.abdelrahman.spring_boot_example.doctor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable int id) {
        return doctorService.getDoctorById(id);
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        return doctorService.saveDoctor(doctor);
    }

    @PutMapping("/{id}")
    public Doctor updateDoctor(@PathVariable int id, @RequestBody Doctor updatedDoctor) {
        Doctor existingDoctor = doctorService.getDoctorById(id);
        if (existingDoctor != null) {
            existingDoctor.setName(updatedDoctor.getName());
            existingDoctor.setEmail(updatedDoctor.getEmail());
            existingDoctor.setOffice(updatedDoctor.getOffice());
            return doctorService.saveDoctor(existingDoctor);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable int id) {
        doctorService.deleteDoctor(id);
    }
}

