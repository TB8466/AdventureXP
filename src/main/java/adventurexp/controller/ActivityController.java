package adventurexp.controller;


import adventurexp.repositories.ActivityRepository;
import adventurexp.model.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    ActivityRepository activityRepository;


@PostMapping(value="/save", consumes = "application/json")
    public ResponseEntity<Activity> createActivity(@RequestBody Activity activity){

    activityRepository.save(activity);

    return new ResponseEntity<Activity>(activity, HttpStatus.CREATED);
    }


    @GetMapping("/get")
    public List<Activity> displayActivities(){


    return activityRepository.findAll();
    }





}
