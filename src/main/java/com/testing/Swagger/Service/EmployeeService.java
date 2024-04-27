//package com.testing.Swagger.Service;
//
//
//import com.testing.Swagger.Entity.Employee;
//import com.testing.Swagger.Repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class EmployeeService {
//    @Autowired
//    EmployeeRepository employeeRepository;
//
//    public List<Employee> getAllEmployees(){
//        return employeeRepository.findAll();
//    }
//    public Optional<Employee> getEmployeeById(Long id){
//        return employeeRepository.findById(id);
//    }
//    public Employee InsertEmployee (Employee employee){
//        return employeeRepository.save(employee);
//    }
//
//
//}
