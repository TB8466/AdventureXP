package adventurexp.controller;

import adventurexp.model.Booking;
import adventurexp.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@CrossOrigin
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;


    @GetMapping("/get")
    public List<Booking> displayBooking(){
        return bookingRepository.findAll();
    }

    
    @PostMapping(value="/save", consumes = "application/json")
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking){

        bookingRepository.save(booking);
        return new ResponseEntity<Booking>(booking, HttpStatus.CREATED);
    }

    @PutMapping("/update/{bookingId}")
    public ResponseEntity<Booking> updatebooking(@PathVariable int bookingId, @RequestBody Booking updatedBooking) {

        Optional<Booking> optionalObj = bookingRepository.findById(bookingId);

        Booking oldBooking  = optionalObj.get();

        oldBooking.setGuestName(updatedBooking.getGuestName());
        oldBooking.setGuestAmount(updatedBooking.getGuestAmount());
        oldBooking.setBookedActivity(updatedBooking.getBookedActivity());
        oldBooking.setDate(updatedBooking.getDate());

        oldBooking = bookingRepository.save(oldBooking);

        return new ResponseEntity<>(oldBooking, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{bookingId}")
    public ResponseEntity<Booking> deleteBooking(@PathVariable int bookingId) throws BookingNotFoundException{
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
