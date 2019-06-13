package com.codeclan.lab.CourseBookingSystem.repositories.CourseRepository;

import com.codeclan.lab.CourseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
