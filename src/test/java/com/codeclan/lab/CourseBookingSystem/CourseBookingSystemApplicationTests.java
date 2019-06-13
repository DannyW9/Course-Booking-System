package com.codeclan.lab.CourseBookingSystem;

import com.codeclan.lab.CourseBookingSystem.models.Booking;
import com.codeclan.lab.CourseBookingSystem.models.Course;
import com.codeclan.lab.CourseBookingSystem.models.Customer;
import com.codeclan.lab.CourseBookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.lab.CourseBookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.lab.CourseBookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingSystemApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindCoursesByRating() {
		List<Course> found = courseRepository.findCourseByRating(3);
		assertEquals(2, found.size());
	}

	@Test
	public void canFindAllCoursesForACustomer() {
		List<Course> found = courseRepository.findCourseByBookingsCustomerId(1L);
		assertEquals(2, found.size());
	}

	@Test
	public void canFindAllCustomersForACourse() {
		List<Customer> found = customerRepository.findCustomerByBookingsCourseId(2L);
		assertEquals(3,found.size());
	}

	@Test
	public void canFindAllBookingsByDate() {
		List<Booking> found = bookingRepository.findBookingByDate("16-06-2020");
		assertEquals(3, found.size());
	}

	@Test
	public void canFindCustomersByTownAndCourse() {
		List<Customer> found = customerRepository.findCustomerByTownAndBookingsCourseId("Glasgow", 2L);
		assertEquals(2, found.size());
	}

	@Test
	public void canFindCustomersOverXAgeByTownAndCourse() {
		List<Customer> found = customerRepository.findCustomerByAgeGreaterThanAndTownAndBookingsCourseId(24, "Glasgow", 2L);
		assertEquals(1, found.size());
	}
}
