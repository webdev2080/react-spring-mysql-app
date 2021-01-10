package com.ryanhelferich.springboot.springboot.service;

import java.util.List;

import com.ryanhelferich.springboot.springboot.modal.Employee;

//Service class used to define logic away from controller

public interface EmployeeService {
	List<Employee> get();
	Employee get(int id);
	void save(Employee employee);
	void delete(int id);
}
