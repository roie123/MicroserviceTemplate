package com.roie.employee_service.CONTROLLERS;

import com.roie.employee_service.ENTITIES.Employee;
import com.roie.employee_service.REPOSITORIES.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
    private final EmployeeRepository employeeRepository;


    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        LOGGER.info("Employee createEmployee: {}", employee);
        return employeeRepository.add(employee);
    }


    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") Long id) {
        LOGGER.info("Employee getEmployee: id={}", id);
        return employeeRepository.findById(id);


    }


    @GetMapping
    public List<Employee> findAll() {
        LOGGER.info("Employee findAll");
        return employeeRepository.findAll();
    }


    @GetMapping("/department/{departmentId}")
    public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId) {
        LOGGER.info("Employee findByDepartment: departmentId={}", departmentId);
        return employeeRepository.findbyDepartment(departmentId);
    }

}