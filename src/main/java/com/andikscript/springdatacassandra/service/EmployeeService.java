package com.andikscript.springdatacassandra.service;

import com.andikscript.springdatacassandra.model.Employee;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmployeeService {

    void createEmmployee(Employee employee);

    List<Employee> getALl();

    Optional<Employee> getById(UUID id);

    String updateEmployee(UUID id, Employee employee);

    String deleteEmployee(UUID id);
}
