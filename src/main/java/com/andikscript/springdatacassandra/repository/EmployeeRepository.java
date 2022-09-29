package com.andikscript.springdatacassandra.repository;

import com.andikscript.springdatacassandra.model.Employee;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmployeeRepository extends CassandraRepository<Employee, UUID> {
}