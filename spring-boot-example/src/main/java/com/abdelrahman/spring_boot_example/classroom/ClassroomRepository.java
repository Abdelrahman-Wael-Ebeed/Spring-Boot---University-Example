package com.abdelrahman.spring_boot_example.classroom;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Integer> {
    // Custom query methods can be added here if necessary
}
