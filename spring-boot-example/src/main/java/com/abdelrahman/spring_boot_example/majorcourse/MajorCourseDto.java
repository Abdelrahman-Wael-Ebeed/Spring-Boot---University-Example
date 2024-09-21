package com.abdelrahman.spring_boot_example.majorcourse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MajorCourseDto {
private int id;
private String majorName;
private String courseName;
}
