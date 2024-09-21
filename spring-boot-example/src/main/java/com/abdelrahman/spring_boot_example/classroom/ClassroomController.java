package com.abdelrahman.spring_boot_example.classroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classrooms")
public class ClassroomController {

    @Autowired
    private ClassroomService classroomService;

    @GetMapping
    public List<Classroom> getAllClassrooms() {
        return classroomService.getAllClassrooms();
    }

    @GetMapping("/{id}")
    public Classroom getClassroomById(@PathVariable int id) {
        return classroomService.getClassroomById(id);
    }

    @PostMapping
    public Classroom createClassroom(@RequestBody Classroom classroom) {
        return classroomService.saveClassroom(classroom);
    }

    @PutMapping("/{id}")
    public Classroom updateClassroom(@PathVariable int id, @RequestBody Classroom updatedClassroom) {
        Classroom existingClassroom = classroomService.getClassroomById(id);
        if (existingClassroom != null) {
            existingClassroom.setBuildingName(updatedClassroom.getBuildingName());
            existingClassroom.setRoomNumber(updatedClassroom.getRoomNumber());
            return classroomService.saveClassroom(existingClassroom);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteClassroom(@PathVariable int id) {
        classroomService.deleteClassroom(id);
    }
}

