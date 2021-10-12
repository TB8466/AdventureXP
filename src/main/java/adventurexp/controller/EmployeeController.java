package adventurexp.controller;


import adventurexp.dao.EmployeeRepository;
import adventurexp.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping("/new")
    public String displayEmployeesForm(Model model){
        Employee anEmployee = new Employee();
        model.addAttribute("employee", anEmployee);

        return "employees/new-employee";
    }

    @PostMapping("/save")
    public String createEmployee(Employee employee, Model model){
        employeeRepository.save(employee);

        return "redirect:/employee/new";
    }

}
