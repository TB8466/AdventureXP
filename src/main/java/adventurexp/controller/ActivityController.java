package adventurexp.controller;


import adventurexp.model.Booking;
import adventurexp.repositories.ActivityRepository;
import adventurexp.model.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
    @RequestMapping("/activity")
public class ActivityController {

    @Autowired
    ActivityRepository activityRepository;


@PostMapping(value="/save", consumes = "application/json")
    public ResponseEntity<Activity> createActivity(@RequestBody Activity activity){

    activityRepository.save(activity);

    return new ResponseEntity<>(activity, HttpStatus.CREATED);
    }


    @GetMapping("/get")
    public List<Activity> displayActivities(){


    return activityRepository.findAll();
    }

    @PutMapping("/update/{activityId}")
    public ResponseEntity<Activity> updateActivity(@PathVariable int activityId, @RequestBody Activity updatedActivity) {

Optional<Activity> optionalObj = activityRepository.findById(activityId);

Activity activity3  = optionalObj.get();

activity3.setActivityName(updatedActivity.getActivityName());
activity3.setAgeReq(updatedActivity.getAgeReq());
activity3.setHeightReq(updatedActivity.getHeightReq());
activity3.setEquipment(updatedActivity.getEquipment());
activity3.setTime(updatedActivity.getTime());

activity3 = activityRepository.save(activity3);

return new ResponseEntity<>(activity3, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{activityId}")
    public ResponseEntity<Activity> deleteActivity(@PathVariable int activityId)  {

     activityRepository.deleteById(activityId);


        return ResponseEntity.ok().build();
    }
}
