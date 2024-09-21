package com.abdelrahman.spring_boot_example.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;

    public List<Schedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }

    public Schedule getScheduleById(int id) {
        return scheduleRepository.findById(id).orElse(null);
    }

    public List<Schedule> getSchedulesByDayOfWeek(String dayOfWeek) {
        return scheduleRepository.findByDayOfWeek(dayOfWeek);
    }

    public List<Schedule> getSchedulesByCourseId(int courseId) {
        return scheduleRepository.findByCourseId(courseId);
    }

    public List<Schedule> getSchedulesByMajorId(int majorId) {
        return scheduleRepository.findByMajorId(majorId);
    }

    public Schedule saveSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    public void deleteSchedule(int id) {
        scheduleRepository.deleteById(id);
    }

}
