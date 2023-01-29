package com.crudproj.CrudApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudproj.CrudApp.dao.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
