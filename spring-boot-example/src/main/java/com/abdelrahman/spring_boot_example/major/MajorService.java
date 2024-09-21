package com.abdelrahman.spring_boot_example.major;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorService {

    @Autowired
    private MajorRepository majorRepository;

    public List<Major> getAllMajors() {
        return majorRepository.findAll();
    }

    public Major getMajorById(int id) {
        return majorRepository.findById(id).orElse(null);
    }

    public Major saveMajor(Major major) {
        return majorRepository.save(major);
    }

    public void deleteMajor(int id) {
        majorRepository.deleteById(id);
    }
}
