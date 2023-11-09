package Task_3.appeal;

import Task_3.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondAppController {
    private final EmployeeService employeeService;

    public SecondAppController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/getEmployee/{id}")
    public Employee getEmployeeFromFirstApp(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }
}
