package com.abdelrahman.spring_boot_example.doctor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    // Additional custom query methods can be added if needed
}
