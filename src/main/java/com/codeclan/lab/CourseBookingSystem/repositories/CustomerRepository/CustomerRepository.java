package com.codeclan.lab.CourseBookingSystem.repositories.CustomerRepository;

import com.codeclan.lab.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
