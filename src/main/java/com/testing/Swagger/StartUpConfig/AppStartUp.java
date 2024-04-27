package com.testing.Swagger.StartUpConfig;


//import com.testing.Swagger.Entity.Department;
//import com.testing.Swagger.Entity.Employee;
//import com.testing.Swagger.Service.DepartmentService;
//import com.testing.Swagger.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AppStartUp implements CommandLineRunner {
//    @Autowired
//    private EmployeeService employeeService;
//    @Autowired
//    private DepartmentService departmentService;


    @Override
    public void run(String... args) throws Exception {
//        if(employeeService.getAllEmployees().isEmpty()){
//            List<Employee> employeeList= new ArrayList<>();
//            Department HR = new Department();
//            HR.setName("HR");
//            Department IT = new Department();
//            IT.setName("IT");
//            departmentService.InsertDepartment(HR);
//            departmentService.InsertDepartment(IT);
//            employeeList.add(new Employee(1L,"mahmoud bdran",2323d,HR));
//            employeeList.add(new Employee(2L,"ahmed hassan",21113d,HR));
//            employeeList.add(new Employee(3L,"omar nabil",2323d,IT));
//            employeeList.add(new Employee(4L,"hassan hassanin",212313d,IT));
//            for (Employee emp : employeeList){
//                employeeService.InsertEmployee(emp);
//            }
//            System.out.println("done successfully");
//        }

    }
}
