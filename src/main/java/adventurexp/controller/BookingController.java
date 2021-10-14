package adventurexp.controller;

import adventurexp.model.Booking;
import adventurexp.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @PostMapping(value="/save", consumes = "application/json")
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking){

        bookingRepository.save(booking);
        return new ResponseEntity<Booking>(booking, HttpStatus.CREATED);
    }
}
