package com.roie.employee_service.REPOSITORIES;

import com.roie.employee_service.ENTITIES.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    List<Employee> employees =new ArrayList<>();




    public List<Employee> findAll(){
        return employees;
    }

    public Employee add(Employee employee){
        employees.add(employee);
        return employee;
    }


    public Employee findById(Long id){
        return employees.stream().filter(employee -> employee.id().equals(id)).findFirst().orElseThrow();
    }

    public List<Employee> findbyDepartment(Long departmentId){
        return employees.stream().filter(employee -> employee.departmetId().equals(departmentId)).toList();
    }




}
