package adventurexp.repositories;

import adventurexp.model.Activity;
import adventurexp.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void getEmployee() throws Exception{
        /*Tjekker DB for hvor mange employee der er. Husk at sætte "spring.jpa.hibernate.ddl-auto=update"
        i application properties når vi tester */

        List<Employee> employeeList = employeeRepository.findAll();
        assertEquals(3, employeeList.size());
    }

}