package com.andikscript.springdatacassandra.controller;

import com.andikscript.springdatacassandra.model.Employee;
import com.andikscript.springdatacassandra.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
        employeeService.createEmmployee(employee);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("CREATED");
    }

    @GetMapping(value = "/all", produces = "application/json")
    public ResponseEntity<?> getALl() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(employeeService.getALl());
    }
}
