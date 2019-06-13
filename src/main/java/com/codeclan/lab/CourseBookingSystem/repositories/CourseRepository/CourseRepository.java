package com.codeclan.lab.CourseBookingSystem.repositories.CourseRepository;

import com.codeclan.lab.CourseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> findCourseByRating(int rating);

    List<Course> findCourseByBookingsCustomerId(Long id);
}
