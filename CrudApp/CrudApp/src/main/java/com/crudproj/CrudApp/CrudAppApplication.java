package com.crudproj.CrudApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.crudproj.CrudApp.dao.Employee;
import com.crudproj.CrudApp.repository.EmployeeRepository;

@SpringBootApplication
public class CrudAppApplication {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CrudAppApplication.class, args);
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
		
		Employee e = new Employee();
		e.setId(1);
		e.setName("Dharmendra");
		e.setDept("IT");
		
		employeeRepository.save(e);
		
	}

}

