package Task_3.appeal;

import Task_3.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {
    private final RestTemplate restTemplate;

    public EmployeeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Employee getEmployeeById(Long id) {
        String url = "http://localhost:8099/employee/" + id;
        return restTemplate.getForObject(url, Employee.class);
    }
}

