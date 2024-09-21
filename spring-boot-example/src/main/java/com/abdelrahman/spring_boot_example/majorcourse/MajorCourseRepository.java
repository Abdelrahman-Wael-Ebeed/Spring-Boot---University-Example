package com.abdelrahman.spring_boot_example.majorcourse;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abdelrahman.spring_boot_example.majorcourse.MajorCourse;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MajorCourseRepository extends JpaRepository<MajorCourse, Integer> {
    @Query("select new com.abdelrahman.spring_boot_example.majorcourse.MajorCourseDto(mc.id, m.name, c.name)" +
            " from MajorCourse mc" +
            " inner join Major m on mc.majorId = m.id" +
            " inner join Course c on mc.courseId = c.id")
    List<MajorCourseDto> findAllMajorCourses();
}

