package com.abdelrahman.spring_boot_example.schedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {

    // Find all schedules for a specific day of the week
    List<Schedule> findByDayOfWeek(String dayOfWeek);

    // Find all schedules for a specific course
    List<Schedule> findByCourseId(int courseId);

    List<Schedule> findByMajorId(int majorId);
}