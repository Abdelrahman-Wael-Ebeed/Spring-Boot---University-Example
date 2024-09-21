package com.abdelrahman.spring_boot_example.major;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/majors")
public class MajorController {

    @Autowired
    private MajorService majorService;

    @GetMapping
    public List<Major> getAllMajors() {
        return majorService.getAllMajors();
    }

    @GetMapping("/{id}")
    public Major getMajorById(@PathVariable int id) {
        return majorService.getMajorById(id);
    }

    @PostMapping
    public Major createMajor(@RequestBody Major major) {
        return majorService.saveMajor(major);
    }

    @PutMapping("/{id}")
    public Major updateMajor(@PathVariable int id, @RequestBody Major updatedMajor) {
        Major existingMajor = majorService.getMajorById(id);
        if (existingMajor != null) {
            existingMajor.setName(updatedMajor.getName());
            return majorService.saveMajor(existingMajor);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteMajor(@PathVariable int id) {
        majorService.deleteMajor(id);
    }
}
