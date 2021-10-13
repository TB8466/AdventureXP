package adventurexp.controller;


import adventurexp.repositories.EmployeeRepository;
import adventurexp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping(value = "/save", consumes = "application/json")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);

        return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
    }

}
