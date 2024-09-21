package com.abdelrahman.spring_boot_example.majorcourse;

import com.abdelrahman.spring_boot_example.majorcourse.MajorCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MajorCourseService {

    @Autowired
    private MajorCourseRepository majorCourseRepository;

    public List<MajorCourse> getAllMajorCourses() {
        return majorCourseRepository.findAll();
    }

    public MajorCourse getMajorCourseById(int id) {
        return majorCourseRepository.findById(id).orElse(null);
    }

    public MajorCourse saveMajorCourse(MajorCourse majorCourse) {
        return majorCourseRepository.save(majorCourse);
    }

    public void deleteMajorCourse(int id) {
        majorCourseRepository.deleteById(id);
    }
}

