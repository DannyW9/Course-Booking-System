package com.codeclan.lab.CourseBookingSystem.controllers;

import com.codeclan.lab.CourseBookingSystem.models.Course;
import com.codeclan.lab.CourseBookingSystem.models.Customer;
import com.codeclan.lab.CourseBookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{courseId}")
    public List<Customer> findCustomerByBookingsCourseId(@PathVariable Long courseId){
        return customerRepository.findCustomerByBookingsCourseId(courseId);
    }

    @GetMapping(value = "/town/{town}/course/{courseId}")
    public List<Customer> findCustomersByTownAndCourseID(@PathVariable String town, @PathVariable Long courseId){
        return customerRepository.findCustomerByTownAndBookingsCourseId(town, courseId);
    }

    @GetMapping(value = "/age/{age}/town/{town}/course/{courseId}")
    public List<Customer> findCustomersGreaterThanXAgeAndByTownAndCourseId(@PathVariable int age, @PathVariable String town, @PathVariable Long courseId){
        return customerRepository.findCustomerByAgeGreaterThanAndTownAndBookingsCourseId(age, town, courseId);
    }
}
