package Task_4;

import Task_3.Employee;
import Task_3.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employee/{id}")
    public String getEmployeeById(@PathVariable Long id, Model model) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        model.addAttribute("employee", employee);
        return "employee";
    }
}
