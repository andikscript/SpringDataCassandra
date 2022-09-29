package com.andikscript.springdatacassandra.service;

import com.andikscript.springdatacassandra.model.Employee;

import java.util.List;

public interface EmployeeService {

    void createEmmployee(Employee employee);

    List<Employee> getALl();
}
