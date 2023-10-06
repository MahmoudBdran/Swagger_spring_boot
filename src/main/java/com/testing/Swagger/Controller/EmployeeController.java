package com.testing.Swagger.Controller;

 import com.testing.Swagger.Entity.Employee;
 import com.testing.Swagger.Service.EmployeeService;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/v3/api/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/add")
    public Employee InsertEmployee (@RequestBody Employee employee){
        return employeeService.InsertEmployee(employee);
    }

}
