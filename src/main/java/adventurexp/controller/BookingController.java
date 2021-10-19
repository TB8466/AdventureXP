package adventurexp.controller;

import adventurexp.model.Booking;
import adventurexp.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/get")
    public List<Booking> displayActivities(){
        return bookingRepository.findAll();
    }


    //delete booking id
    /*@GetMapping(path = "/delete/{id}")
    public ResponseEntity<Booking> deleteBooking(@PathVariable int id){
        bookingRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }*/

    @DeleteMapping("/booking/{id}")
    public ResponseEntity<?> deleteBooking(@PathVariable(value = "id") Integer bookingId) throws BookingNotFoundException{
        Booking booking = bookingRepository.findById(bookingId).orElseThrow(() -> new BookingNotFoundException(bookingId));

        bookingRepository.delete(booking);
        return ResponseEntity.ok().build();
    }

    private class BookingNotFoundException extends Exception {
        private Integer booking_id;
        public BookingNotFoundException(Integer booking_id){
            super(String.format("Booking_id", booking_id, " blev ikke fundet i systemet"));
        }
    }
}
