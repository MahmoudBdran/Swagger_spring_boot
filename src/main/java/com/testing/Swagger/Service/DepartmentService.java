//package com.testing.Swagger.Service;
//
//
//import com.testing.Swagger.Entity.Department;
//import com.testing.Swagger.Repository.DepartmentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class DepartmentService {
//    @Autowired
//    DepartmentRepository departmentRepository;
//
//    public List<Department> getAllDepartments(){
//        return departmentRepository.findAll();
//    }
//    public Optional<Department> getDepartmentById(Long id){
//        return departmentRepository.findById(id);
//    }
//
//    public Department InsertDepartment (Department department){
//        return departmentRepository.save(department);
//    }
//
//}
