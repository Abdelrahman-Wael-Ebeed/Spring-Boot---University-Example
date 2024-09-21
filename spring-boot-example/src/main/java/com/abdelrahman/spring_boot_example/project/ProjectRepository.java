package com.abdelrahman.spring_boot_example.project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    // Additional query methods can be defined here if needed.
}
