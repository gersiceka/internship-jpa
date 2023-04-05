package com.lhind.repository;

import com.lhind.model.entity.Employee;

import java.util.Optional;

public interface EmployeeRepository extends Repository<Employee, Long> {

    Optional<Employee> findByUsername(String username);

}
