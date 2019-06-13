package com.codeclan.lab.CourseBookingSystem.components;


import com.codeclan.lab.CourseBookingSystem.models.Booking;
import com.codeclan.lab.CourseBookingSystem.models.Course;
import com.codeclan.lab.CourseBookingSystem.models.Customer;
import com.codeclan.lab.CourseBookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.lab.CourseBookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.lab.CourseBookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Customer scott = new Customer("Scott", "Glasgow", 28);
        customerRepository.save(scott);

        Customer danny = new Customer("Danny", "Glasgow", 26);
        customerRepository.save(danny);

        Customer calum = new Customer("Calum", "Kilmarnock", 16);
        customerRepository.save(calum);

        Course course1 = new Course("Software Development", "Glasgow", 5);
        courseRepository.save(course1);

        Course course2 = new Course("Data Analysis", "Edinburgh", 3);
        courseRepository.save(course2);

        Course course3 = new Course("Introduction to Python", "Glasgow", 3);
        courseRepository.save(course3);

        Booking booking1 = new Booking("01-01-2020", scott, course1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("01-01-2020", danny, course1);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("01-01-2020", calum, course1);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("16-06-2020", danny, course2);
        bookingRepository.save(booking4);

        Booking booking5 = new Booking("16-06-2020", calum, course2);
        bookingRepository.save(booking5);

        Booking booking6 = new Booking("22-03-2020", scott, course3);
        bookingRepository.save(booking6);


    }
}
