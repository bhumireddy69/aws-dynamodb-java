package com.bhoomi.awsemployee.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhoomi.awsemployee.entity.Employee;
import com.bhoomi.awsemployee.service.EmployeeService;


/**
 * All the controllers related to Employee Service 
 * 
 * @filename EmployeeController.java
 *
 * @author Chaitanya Bhoomireddy
 * 
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EmployeeService empService;
	
	@GetMapping
	public List<Employee> getAllEmployees()  
	{	
		logger.info("Getting All employees");
		List<Employee> list = empService.getAllEmployees();
		return list;
	}	
	
	@PostMapping(value = "/add", consumes= "application/json", produces="application/json")
	public String addEmplooyee(@RequestBody Employee employee)  
	{	
		logger.info("add employee");
		String id = empService.addEmployee(employee);
		return id;
	}	

}
