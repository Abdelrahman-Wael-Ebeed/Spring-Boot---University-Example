package com.abdelrahman.spring_boot_example.classroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClassroomService {

    @Autowired
    private ClassroomRepository classroomRepository;

    public List<Classroom> getAllClassrooms() {
        return classroomRepository.findAll();
    }

    public Classroom getClassroomById(int id) {
        return classroomRepository.findById(id).orElse(null);
    }

    public Classroom saveClassroom(Classroom classroom) {
        return classroomRepository.save(classroom);
    }

    public void deleteClassroom(int id) {
        classroomRepository.deleteById(id);
    }
}
