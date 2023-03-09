package com.codeclan.example.CourseBookingSystem.components;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repositories.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CustomerRepository;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){};


    public void run(ApplicationArguments args){

        Course course1 = new Course("Art of Seduction", "Edinburgh", 5);
        courseRepository.save(course1);
        Course course2 = new Course("Hunting Squirrels", "Edinburgh", 2);
        courseRepository.save(course2);
        Course course3 = new Course("Jumping", "Edinburgh", 5);
        courseRepository.save(course3);
        Course course4 = new Course("Running away from your fears", "Edinburgh", 4);
        courseRepository.save(course4);

        Customer customer1 = new Customer("John", "Sticks", 12);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Gareth", "Edinburgh", 30);
        customerRepository.save(customer2);
        Customer customer3 = new Customer("Sweden", "Edinburgh", 29);
        customerRepository.save(customer3);

        Booking booking1 = new Booking("01-09-23", customer1, course1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("14-09-23", customer2, course3);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("21-09-23", customer3, course4);
        bookingRepository.save(booking3);






    }


}
