package adventurexp.controller;


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

    return new ResponseEntity<Activity>(activity, HttpStatus.CREATED);
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


    /*
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
                                                   @Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        employee.setEmailId(employeeDetails.getEmailId());
        employee.setLastName(employeeDetails.getLastName());
        employee.setFirstName(employeeDetails.getFirstName());
        final Employee updatedEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }

    @PutMapping("/kommune/{kommuneKode}")
    public ResponseEntity<Kommune> updateKommune(@PathVariable int kommuneKode, @RequestBody Kommune kommune) {
        Optional<Kommune> kommuneData = kommuneRepository.findById(kommuneKode);
        if (kommuneData.isPresent()) {
            Kommune _kommune = kommuneData.get();
            _kommune.setKommune(kommune.getKommune()); //her sættes kommunenavn
            _kommune = kommuneRepository.save(_kommune);
            return new ResponseEntity<>(_kommune, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



    */

}
