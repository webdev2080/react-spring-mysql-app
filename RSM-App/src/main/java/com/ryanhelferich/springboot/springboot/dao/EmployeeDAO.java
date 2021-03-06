package com.ryanhelferich.springboot.springboot.dao;

import java.util.List;

import com.ryanhelferich.springboot.springboot.modal.Employee;

//Database Access Object interface used to provide access to the database.

public interface EmployeeDAO {
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
