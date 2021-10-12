package adventurexp.Controllers;


import adventurexp.dao.EmployeesRepository;
import entities.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmpController {

    @Autowired
    EmployeesRepository employeesRepository;

    @GetMapping("/new")
    public String displayEmployeesForm(Model model){

        Employees anEmployees = new Employees();
        model.addAttribute("employee", anEmployees);

        return "";

    }

}
