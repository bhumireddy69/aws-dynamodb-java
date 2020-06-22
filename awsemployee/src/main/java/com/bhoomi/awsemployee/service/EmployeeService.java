package com.bhoomi.awsemployee.service;

import java.util.List;

import com.bhoomi.awsemployee.entity.Employee;

/**
 * EmployeeSerice mapped for Employee Controller 
 * 
 * @filename EmployeeService.java
 *
 * @author Chaitanya Bhoomireddy
 * 
 */

public interface EmployeeService {
	public abstract List<Employee> getAllEmployees();
	public abstract String addEmployee(Employee employee);

}
