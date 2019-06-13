package com.codeclan.lab.CourseBookingSystem.repositories.BookingRepository;

import com.codeclan.lab.CourseBookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
}
