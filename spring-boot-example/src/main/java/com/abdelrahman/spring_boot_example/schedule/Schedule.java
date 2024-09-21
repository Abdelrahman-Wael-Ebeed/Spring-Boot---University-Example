package com.abdelrahman.spring_boot_example.schedule;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "schedule", schema = "university")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "course_id")
    private Integer courseId;

    @Column(name = "clasroom_id")
    private Integer clasroomId;

    @Column(name = "major_id")
    private Integer majorId;

    @Column(name = "day_of_week", length = 45)
    private String dayOfWeek;

    @Column(name = "start_time")
    private Instant startTime;

    @Column(name = "end_time")
    private Instant endTime;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

}