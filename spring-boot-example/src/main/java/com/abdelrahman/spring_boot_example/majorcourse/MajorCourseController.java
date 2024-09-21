package com.abdelrahman.spring_boot_example.majorcourse;

import com.abdelrahman.spring_boot_example.majorcourse.MajorCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/major-courses")
public class MajorCourseController {

    @Autowired
    private MajorCourseService majorCourseService;

    @GetMapping
    public List<MajorCourse> getAllMajorCourses() {
        return majorCourseService.getAllMajorCourses();
    }

    @GetMapping("/{id}")
    public MajorCourse getMajorCourseById(@PathVariable int id) {
        return majorCourseService.getMajorCourseById(id);
    }


    @PostMapping
    public MajorCourse createMajorCourse(@RequestBody MajorCourse majorCourse) {
        return majorCourseService.saveMajorCourse(majorCourse);
    }

    @PutMapping("/{id}")
    public MajorCourse updateMajorCourse(@PathVariable int id, @RequestBody MajorCourse updatedMajorCourse) {
        updatedMajorCourse.setId(id);
        return majorCourseService.saveMajorCourse(updatedMajorCourse);
    }

    @DeleteMapping("/{id}")
    public void deleteMajorCourse(@PathVariable int id) {
        majorCourseService.deleteMajorCourse(id);
    }
}
