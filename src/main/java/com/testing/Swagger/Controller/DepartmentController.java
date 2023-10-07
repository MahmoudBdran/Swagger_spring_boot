package com.testing.Swagger.Controller;

 import com.testing.Swagger.Entity.Department;
 import com.testing.Swagger.Service.DepartmentService;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/v3/api/departments")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;
    
    @GetMapping("/")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
    @GetMapping("/{id}")
    public Optional<Department> getDepartmentById(@PathVariable Long id){
        return departmentService.getDepartmentById(id);
    }
    @PostMapping("/add")
    public Department InsertDepartment (@RequestBody Department department){
        return departmentService.InsertDepartment(department);
    }@GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
}
