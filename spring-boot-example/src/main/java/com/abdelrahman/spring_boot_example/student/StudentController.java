package com.abdelrahman.spring_boot_example.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        Student existingStudent = studentService.getStudentById(id);
        if (existingStudent != null) {
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setEmail(updatedStudent.getEmail());
            existingStudent.setPhoneNumber(updatedStudent.getPhoneNumber());
            existingStudent.setDateOfBirth(updatedStudent.getDateOfBirth());
            existingStudent.setAddress(updatedStudent.getAddress());
            existingStudent.setMajorId(updatedStudent.getMajorId());
            existingStudent.setCourseId(updatedStudent.getCourseId());
            existingStudent.setProjectId(updatedStudent.getProjectId());
            return studentService.saveStudent(existingStudent);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }
}
