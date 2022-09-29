package com.andikscript.springdatacassandra.service;

import com.andikscript.springdatacassandra.model.Employee;
import com.andikscript.springdatacassandra.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void createEmmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getALl() {
        return employeeRepository.findAll();
    }
}