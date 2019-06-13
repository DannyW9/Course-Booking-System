package com.codeclan.lab.CourseBookingSystem.controllers;

import com.codeclan.lab.CourseBookingSystem.models.Course;
import com.codeclan.lab.CourseBookingSystem.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> findCoursebyRating(@PathVariable int rating){
        return courseRepository.findCourseByRating(rating);
    }

    @GetMapping(value = "/customer/{customerId}")
    public List<Course> findCourseByCustomer(@PathVariable Long customerId){
        return courseRepository.findCourseByBookingsCustomerId(customerId);
    }
}
