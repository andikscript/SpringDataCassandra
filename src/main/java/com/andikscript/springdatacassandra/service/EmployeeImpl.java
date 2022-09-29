package com.andikscript.springdatacassandra.service;

import com.andikscript.springdatacassandra.model.Employee;
import com.andikscript.springdatacassandra.repository.EmployeeRepository;
import com.fasterxml.uuid.Generators;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void createEmmployee(Employee employee) {
        employee.setId(Generators.timeBasedGenerator().generate());
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getALl() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getById(UUID id) {
        if (!employeeRepository.findById(id).isPresent()) {
            return null;
        }

        return employeeRepository.findById(id);
    }

    @Override
    public String updateEmployee(UUID id, Employee employee) {
        if (!employeeRepository.findById(id).isPresent()) {
            return "NOT FOUND";
        }

        Employee employeeSecond = employeeRepository.findById(id).get();
        employeeSecond.setName(employee.getName());
        employeeSecond.setSalary(employee.getSalary());
        employeeRepository.save(employeeSecond);

        return "Success";
    }

    @Override
    public String deleteEmployee(UUID id) {
        if (!employeeRepository.findById(id).isPresent()) {
            return "NOT FOUND";
        }

        employeeRepository.deleteById(id);

        return "Success";
    }
}