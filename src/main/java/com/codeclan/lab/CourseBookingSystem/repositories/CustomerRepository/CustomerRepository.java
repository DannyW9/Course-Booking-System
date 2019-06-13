package com.codeclan.lab.CourseBookingSystem.repositories.CustomerRepository;

import com.codeclan.lab.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

    List<Customer> findCustomerByBookingsCourseId(Long courseId);

    List<Customer> findCustomerByTownAndBookingsCourseId(String town, Long courseId);

    List<Customer> findCustomerByAgeGreaterThanAndTownAndBookingsCourseId(int age, String town, Long courseId);
}
