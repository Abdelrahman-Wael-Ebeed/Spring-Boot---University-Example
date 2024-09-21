package com.abdelrahman.spring_boot_example.course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    // Custom query methods can be added if needed
}
