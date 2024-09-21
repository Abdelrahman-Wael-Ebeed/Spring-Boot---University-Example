package com.abdelrahman.spring_boot_example.major;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MajorRepository extends JpaRepository<Major, Integer> {
    // Additional custom query methods can be added if needed
}
