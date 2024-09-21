package com.abdelrahman.spring_boot_example.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping
    public List<Schedule> getAllSchedules() {
        return scheduleService.getAllSchedules();
    }

    @GetMapping("/{id}")
    public Schedule getScheduleById(@PathVariable int id) {
        return scheduleService.getScheduleById(id);
    }

    @GetMapping("/day/{dayOfWeek}")
    public List<Schedule> getSchedulesByDayOfWeek(@PathVariable String dayOfWeek) {
        return scheduleService.getSchedulesByDayOfWeek(dayOfWeek);
    }

    @GetMapping("/course/{courseId}")
    public List<Schedule> getSchedulesByCourseId(@PathVariable int courseId) {
        return scheduleService.getSchedulesByCourseId(courseId);
    }

    @PostMapping
    public Schedule createSchedule(@RequestBody Schedule schedule) {
        schedule.setCreatedAt(Instant.now());  // Set the creation timestamp
        schedule.setUpdatedAt(Instant.now());  // Set the update timestamp
        return scheduleService.saveSchedule(schedule);
    }

    @DeleteMapping("/{id}")
    public void deleteSchedule(@PathVariable int id) {
        scheduleService.deleteSchedule(id);
    }
}
