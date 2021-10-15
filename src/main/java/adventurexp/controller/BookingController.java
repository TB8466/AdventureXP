package adventurexp.controller;

import adventurexp.model.Activity;
import adventurexp.model.Booking;
import adventurexp.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

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

    //delete booking id
    @GetMapping(path = "/delete/{id}")
    public ResponseEntity<Booking> deleteBooking(@PathVariable int id){
        bookingRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
